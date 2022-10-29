package com.curso.model;

public class Informacion {
	private String nombre;
	private int edad;
	private String correo;
	
	// Constructor vacio
	public Informacion() {
		super();
	}
	
	// Constructor con todos los parametros
	public Informacion(String nombre, int edad, String correo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}

	// Constructores
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	 
}
