package com.proyectoMicro.catalogo_servicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient
public class CatalogoServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogoServicioApplication.class, args);
	}  

	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
