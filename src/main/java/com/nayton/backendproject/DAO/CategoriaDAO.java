package com.nayton.backendproject.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nayton.backendproject.domain.Categoria;

@Repository
public interface CategoriaDAO extends JpaRepository<Categoria, Integer>{

	
}
