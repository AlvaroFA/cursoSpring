package com.ejercicio.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.ejercicio.model")
@EnableJpaRepositories(basePackages = {"com.ejercicio.dao","com.ejercicio.repository"})
@SpringBootApplication(scanBasePackages = {"com.ejercicio.controller", "com.ejercicio.service"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
