package com.ejercicio.modelo;

public class Ejemplar {
	private int isbn;
	private String titulo;
	private String autor;
	
	//contructores
	public Ejemplar() {
		super();
	}
	public Ejemplar(int isbn, String titulo, String autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	}	
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
