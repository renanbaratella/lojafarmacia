package com.generation.lojafarmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojafarmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	public List<Produto> findAllByMarcaIgnoreCaseAndPrecoGreaterThan(String marca, BigDecimal preco);
	public List<Produto> findAllByMarcaIgnoreCaseOrNomeIgnoreCase(String marca, String nome);
	public List<Produto> findAllByPrecoBetween(BigDecimal preco1, BigDecimal preco2);
}
