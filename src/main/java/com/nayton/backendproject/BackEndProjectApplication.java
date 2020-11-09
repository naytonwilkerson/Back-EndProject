package com.nayton.backendproject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nayton.backendproject.DAO.CategoriaDAO;
import com.nayton.backendproject.domain.Categoria;

@SpringBootApplication
public class BackEndProjectApplication implements CommandLineRunner{

	@Autowired
	private CategoriaDAO categoriaDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(BackEndProjectApplication.class, args);
	}

	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaDAO.saveAll(Arrays.asList(cat1,cat2));
	}

}
