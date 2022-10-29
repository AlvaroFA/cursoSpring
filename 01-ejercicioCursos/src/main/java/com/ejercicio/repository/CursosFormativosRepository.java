package com.ejercicio.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.Repository;

import com.ejercicio.model.CursosFormativo;

@org.springframework.stereotype.Repository(value="CursosFormativo")

public interface CursosFormativosRepository extends Repository<CursosFormativo, Integer> {
	List<CursosFormativo> findByPrecioBetween(int precioMin, int precioMax, Sort sort);
}
