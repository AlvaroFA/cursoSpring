package com.ejercicio.controller;

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
import org.springframework.data.domain.Sort;

import com.ejercicio.model.CursosFormativo;
import com.ejercicio.repository.CursosFormativosRepository;
import com.ejercicio.service.CursosFormativosService;


@RestController
public class CursosFormativoController {

	@Autowired  CursosFormativosService service;
	@Autowired  CursosFormativosRepository repository;
	
	
	//Devuelve todos los cursos
	@GetMapping(value="curso", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CursosFormativo> getAllCursos() {
		return service.getAllCursos();
	}
	
	//Devuelve un curso
	@GetMapping(value="curso/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CursosFormativo buscarLibro(@PathVariable("codCurso") int codCurso) {
		return service.getCursoFormativo(codCurso);
	}
	
	//Da de alta un curso
	@PostMapping (value="curso", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createCurso(@RequestBody CursosFormativo curso) {
		service.createCursoFormativo(curso);
	}
	
	//Eliminacion curso
	@DeleteMapping (value="curso/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CursosFormativo> eliminarLibro (@PathVariable("codCurso") int codCurso) {
		return service.deleteCursoFormativo(codCurso);
	}
	
	//Actualiza la duracion de un curso en funcion del codcurso y de la hora del curso
	@PutMapping (value="curso/{codCurso}/{horas}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateLibro (@PathVariable("codCurso") int codCurso, @PathVariable("horas") int horas ) {
		service.updateCursoFormativo(codCurso,horas);
	}
	
	//Devuelve la lista de cursos en funcion de un rango de precios min y max ordenado por el precio minimo
	@GetMapping(value="curso/{precioMin}/{precioMax}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CursosFormativo> getCursosByPrice(@PathVariable("precioMin") int precioMin,@PathVariable("precioMax") int precioMax) {
		Sort sort = Sort.by("Precio").ascending();
		return repository.findByPrecioBetween(precioMin, precioMax,sort);
	}
	
	
	
}
