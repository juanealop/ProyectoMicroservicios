package com.proyectoMicro.cliente_servicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class ClienteServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteServicioApplication.class, args);
	}

}
