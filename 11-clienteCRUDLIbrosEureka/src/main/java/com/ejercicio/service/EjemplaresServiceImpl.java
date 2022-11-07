package com.ejercicio.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ejercicio.modelo.Ejemplar;

@Service
public class EjemplaresServiceImpl implements EjemplarService{

	@Autowired
	RestTemplate template;

	private String url = "http://servicio-libros/";
	
	@Override
	public List<Ejemplar> nuevoEjemplar(Ejemplar ejemplar) {
		template.postForLocation(url+"libro", ejemplar);
		return Arrays.asList(template.getForObject(url+"libros", Ejemplar[].class));
	}
	
}
