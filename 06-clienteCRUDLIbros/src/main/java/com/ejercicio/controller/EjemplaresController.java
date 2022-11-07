package com.ejercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.modelo.Ejemplar;
import com.ejercicio.service.EjemplarService;

@RestController

public class EjemplaresController {

	@Autowired
	EjemplarService service;
	
	
	@PostMapping(value= "ejemplar/{isbn}/{titulo}/{autor}")
	public List<Ejemplar> altaEjemplar (@PathVariable("isbn")int  isbn,@PathVariable("titulo") String titulo,@PathVariable("autor")  String autor){
		Ejemplar ej = new Ejemplar(isbn,titulo,autor);
		return service.nuevoEjemplar(ej);
	}
}
