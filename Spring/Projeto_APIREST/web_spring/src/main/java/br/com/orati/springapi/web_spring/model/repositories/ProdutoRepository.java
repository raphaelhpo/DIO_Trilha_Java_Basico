package br.com.orati.springapi.web_spring.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.orati.springapi.web_spring.model.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
