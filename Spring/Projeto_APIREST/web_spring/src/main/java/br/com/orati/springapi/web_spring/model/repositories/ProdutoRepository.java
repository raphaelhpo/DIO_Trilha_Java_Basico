package br.com.orati.springapi.web_spring.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.orati.springapi.web_spring.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

}
