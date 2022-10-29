package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Libro;

@Service
public class LibroServiceImpl implements LibroService {

	List<Libro> libros;
	public LibroServiceImpl () {
		libros =new ArrayList<>();
		libros.add(new Libro(1,"Libro1","Autor1"));
		libros.add(new Libro(2,"Libro2","Autor2"));
		libros.add(new Libro(3,"Libro3","Autor3"));
		libros.add(new Libro(4,"Libro4","Autor4"));
		libros.add(new Libro(5,"Libro5","Autor5"));
		libros.add(new Libro(6,"Libro6","Autor6"));
		libros.add(new Libro(7,"Libro7", "Autor 6"));
	}
	
	@Override
	public List<Libro> obtenerLibros() {
		return libros;
	}

	@Override
	public Libro buscarLibroByIsbn(int isbn) {
		return libros.stream().filter(l->l.getIsbn() == isbn).findFirst().orElse(null);
	}

	@Override
	public void altaLibro(Libro libro) {
		libros.add(libro);
	}

	@Override
	public void actualizarLibro(Libro libro) {
		Libro lib = buscarLibroByIsbn(libro.getIsbn());
		if(lib != null) {
			lib.setTitulo(libro.getTitulo());
			lib.setAutor(libro.getAutor());
		}
	}

	@Override
	public List<Libro> eliminarLibro(int isbn) {
		libros.removeIf(lb -> lb.getIsbn()== isbn);
		return libros;
	}

}
