package com.curso.model;

public class Libro {

private int isbn;
private String titulo;
private String autor;


//Constructor con todos los atributos
public Libro(int isbn, String titulo, String autor) {
	super();
	this.isbn = isbn;
	this.titulo = titulo;
	this.autor = autor;
}

//Constructor vacio
public Libro() {
	super();
}

//Getters y setters
public int getIsbn() {
	return isbn;
}

public void setIsbn(int isbn) {
	this.isbn = isbn;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}
 
}
