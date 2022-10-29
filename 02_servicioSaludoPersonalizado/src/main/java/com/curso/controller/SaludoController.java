package com.curso.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

	
	@GetMapping(value="saludo", produces=MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Saludos humano";
	}

	
	@GetMapping(value="saludo/{n}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo(@PathVariable("n") String nombre) {
		return "Bienvenido "+ nombre;
	}
}
