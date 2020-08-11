package com.farmacia10.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia10.farmacia.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);

}