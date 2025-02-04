package com.loja.loja.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.loja.loja.model.Produto;
import com.loja.loja.repository.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository repository;

    public void cadastrar(Produto produto) {
        //TODO: Cadastrar Produto.
        repository.save(produto);
    }
    public void atualizar(Produto produto) {
        //TODO: Atualizar dados de um produto.
        Optional<Produto> produtoLocal = repository.findById(produto.getId());
        produto.setId(produtoLocal.get().getId());
        repository.save(produto);
    }
    public Iterable<Produto> listar() {
        //TODO: Listar TODOS os Produtos.
        return repository.findAll();
    }
    public Iterable<Produto> listarPages(int page) {
        //TODO: Listar TODOS os Produtos.
        Pageable pageRequest = PageRequest.of(page, 2);
        return repository.findAll(pageRequest);
    }
    public Optional<Produto> buscarPorId(Long id){
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.delete(repository.findById(id).get());
    }
}
