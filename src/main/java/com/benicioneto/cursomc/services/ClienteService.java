package com.benicioneto.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.benicioneto.cursomc.domain.Cliente;
import com.benicioneto.cursomc.repositories.ClienteRepository;

import com.benicioneto.cursomc.services.exceptions.*;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Obejeto não encontrado ! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}