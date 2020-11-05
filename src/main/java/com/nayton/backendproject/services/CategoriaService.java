package com.nayton.backendproject.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nayton.backendproject.DAO.CategoriaDAO;
import com.nayton.backendproject.domain.Categoria;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaDAO  repo;
	
	public Categoria Buscar(Integer id) {
		 Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	} 
	
}
