package com.ejercicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.dao.CursosFormativosDao;
import com.ejercicio.model.CursosFormativo;

@Service
public class CursosFormativosServiceImpl implements CursosFormativosService {

	@Autowired CursosFormativosDao dao;
	
	@Override
	public List<CursosFormativo> getAllCursos() {
		return dao.findAll();
	}

	@Override
	public CursosFormativo getCursoFormativo(int codCurso) {
		return dao.findById(codCurso).orElse(null);
	}

	@Override
	public void createCursoFormativo(CursosFormativo curso) {
		dao.save(curso);
	}

	@Override
	public List<CursosFormativo> deleteCursoFormativo(int codCurso) {
		dao.deleteById(codCurso);
		return dao.findAll();
	}

	@Override
	public void updateCursoFormativo(int codCurso, int horasCurso) {
		dao.findById(codCurso).ifPresent(c -> {
			c.setDuracion(horasCurso);
			dao.save(c);
		});

	}
}
