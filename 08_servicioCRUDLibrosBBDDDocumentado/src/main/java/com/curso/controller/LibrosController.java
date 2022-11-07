package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Libro;
import com.curso.service.LibroService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class LibrosController {

	@Autowired
	LibroService service;
	
	@ApiOperation (value="devuelve un libro por el isbn")
	@ApiParam(value= "isbn del libro a devolver")
	@GetMapping(value="libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Libro buscarLibro(@PathVariable("isbn") int isbn) {
		return service.buscarLibroByIsbn(isbn);
	}
	
	@ApiOperation (value="devuelve la lista de todos los libracos")
	@GetMapping(value="libros", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> obtenerLibros() {
		return service.obtenerLibros();
	}
	
	@ApiOperation (value="crea un nuevo libro")
	@ApiParam(value = "Json con los datos del libro")
	@PostMapping (value="libro", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void agregarLibro(@RequestBody Libro libro) {
		service.altaLibro(libro);
	}
	
	@PutMapping (value="libro", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateLibro (@RequestBody Libro libro) {
		service.actualizarLibro(libro);
	}
	
	@DeleteMapping (value="libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> eliminarLibro (@PathVariable("isbn") int isbn) {
		return service.eliminarLibro(isbn);
	}
}
