package com.ejercicio.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication(scanBasePackages = {"com.ejercicio.controller","com.ejercicio.service"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public RestTemplate template() {
		BasicAuthenticationInterceptor bai;
		bai= new BasicAuthenticationInterceptor("admin", "admin");
		RestTemplate template = new RestTemplate();
		template.getInterceptors().add(bai);
		return template; 
	}
}
