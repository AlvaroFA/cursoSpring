package com.curso.service;

import java.util.List;

import com.curso.model.Libro;

public interface LibroService {

	//Devuelve lista de libros
	List<Libro> obtenerLibros();
	//Devuelve libro segun isbn
	Libro buscarLibroByIsbn (int isbn);
	// Da de alta un libro
	void altaLibro(Libro libro);
	// Actualiza un libro
	void actualizarLibro (Libro libro);
	// Elimina libro segun isbn y  devuelve lista de libros
	List<Libro> eliminarLibro (int isbn);
	
}
