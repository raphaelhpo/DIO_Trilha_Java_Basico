package br.com.orati.springapi.web_spring.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.orati.springapi.web_spring.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
