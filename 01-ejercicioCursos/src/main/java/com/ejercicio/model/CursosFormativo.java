package com.ejercicio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cursosformativo")
public class CursosFormativo {
	
	@Id
	private int codCurso;
	private String nombre;
	private int duracion;
	private int precio;
	
	
	//Constructor vacio
	public CursosFormativo() {
		super();
	}
	// Constructor con todos los atributos
	public CursosFormativo(int codCurso, String nombre, int duracion, int precio) {
		super();
		this.codCurso = codCurso;
		this.nombre = nombre;
		this.duracion = duracion;
		this.precio = precio;
	}
	// getters y setters 
	public int getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

}
