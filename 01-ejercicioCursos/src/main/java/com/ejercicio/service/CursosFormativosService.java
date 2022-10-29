package com.ejercicio.service;

import java.util.List;

import com.ejercicio.model.CursosFormativo;

public interface CursosFormativosService {

	
	
	//Devuelve todos los cursos
	List<CursosFormativo> getAllCursos();
	//Devuelve un curso por cod
	CursosFormativo getCursoFormativo(int codCurso);
	//Da de alta un curso
	void createCursoFormativo (CursosFormativo curso);
	//Elimina un curso
	List<CursosFormativo> deleteCursoFormativo(int codCurso);
	//Actualiza la duracion de un curso
	void updateCursoFormativo(int codCurso, int horasCurso);
	//Devuelve lista cursos por parametros precio min y max
}
