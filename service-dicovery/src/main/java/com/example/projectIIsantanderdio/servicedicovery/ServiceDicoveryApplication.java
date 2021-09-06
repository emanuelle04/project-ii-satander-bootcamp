package com.example.projectIIsantanderdio.servicedicovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaService
public class ServiceDicoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDicoveryApplication.class, args);
	}

}
