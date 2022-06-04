package com.generation.lojafarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojafarmacia.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findAllByTipo(String tipo);
	public List<Categoria> findAllByTipoStartingWith(String tipo);
	
}
