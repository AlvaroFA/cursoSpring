package com.curso.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Informacion;

@RestController
public class SaludoController {

	//Devuelve un saludo
	@GetMapping(value="saludo", produces=MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Saludos humano";
	}

	// Devuelve saludo personalizado
	@GetMapping(value="saludo/{n}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo(@PathVariable("n") String nombre) {
		return "Bienvenido "+ nombre;
	}
	
	//Devuelve los datos de un usuario en Json
	@GetMapping(value="userinfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public Informacion informacion() {
		return new Informacion("UsuarioTest",50,"test@test.com");
	}
}
