package com.proyectoMicro.catalogo_servicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class CatalogoServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogoServicioApplication.class, args);
	}

}
