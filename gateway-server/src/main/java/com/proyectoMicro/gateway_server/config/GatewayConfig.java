
package com.proyectoMicro.gateway_server.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GatewayConfig {

    @Bean
    RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()

                // 🔑 Keycloak
                .route("keycloak_route", r -> r
                        .path("/keycloak-server/**")
                        .filters(f -> f.rewritePath(
                                "/keycloak-server/(?<segment>.*)",
                                "/${segment}"))
                        .uri("http://localhost:9000"))

                // 👤 Cliente Servicio
                .route("clientes_service", r -> r
                        .path("/api/clientes/**")
                        .filters(f -> f.rewritePath(
                                "/api/clientes(?<segment>/?.*)",
                                "/clientes${segment}"))
                        .uri("lb://CLIENTE-SERVICIO"))

                // 🏢 Proveedor Servicio
                .route("proveedores_service", r -> r
                        .path("/api/proveedores/**")
                        .filters(f -> f.rewritePath(
                                "/api/proveedores(?<segment>/?.*)",
                                "/proveedores${segment}"))
                        .uri("lb://PROVEEDOR-SERVICIO"))

                // 📦 Catálogo Servicio
                .route("catalogo_service", r -> r
                        .path("/api/catalogo/**")
                        .filters(f -> f.rewritePath(
                                "/api/catalogo(?<segment>/?.*)",
                                "/catalogo${segment}"))
                        .uri("lb://CATALOGO-SERVICIO"))

                // 🛒 Carro Servicio
                .route("carro_service", r -> r
                        .path("/api/carro/**")
                        .filters(f -> f.rewritePath(
                                "/api/carro(?<segment>/?.*)",
                                "/carro${segment}"))
                        .uri("lb://CARRO-SERVICIO"))

                .build();
    }
}