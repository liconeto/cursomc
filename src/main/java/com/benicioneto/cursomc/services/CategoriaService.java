package com.benicioneto.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.benicioneto.cursomc.domain.Categoria;
import com.benicioneto.cursomc.repositories.CategoriaRepository;

import com.benicioneto.cursomc.services.exceptions.*;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Obejeto não encontrado ! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}