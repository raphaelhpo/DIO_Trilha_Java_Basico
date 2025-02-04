package com.loja.loja.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.loja.loja.model.Produto;
import com.loja.loja.service.ProdutoService;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {
    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public @ResponseBody Produto cadastrar(@RequestBody Produto produto) {
        //TODO: Cadastra um Produto.
        produtoService.cadastrar(produto);
        return produto;
    }
    @GetMapping
    public Iterable<Produto> listarTudo(){
        return produtoService.listar();
    }
    @GetMapping(path = "/paginacao/{pagina}")
    public Iterable<Produto> ObterProdutosPorPagina(@PathVariable int pagina) {
        //TODO: Lista TODOS os Produtos em listagem por páginas.
        return produtoService.listarPages(pagina);
    }
    @GetMapping("/{id}")
    public Optional<Produto> buscar(@PathVariable Long id) {
        //TODO:Buscar Produto por ID
        return produtoService.buscarPorId(id);
    }
    @PutMapping("/{id}")
    public @ResponseBody Produto atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        //TODO: Atualiza dados de um produto.
        produtoService.atualizar(produto);
        return produto;
    }
    @DeleteMapping("/{id}")
    public String deleteMethodName(@PathVariable Long id) {
        //TODO: Deletar um produto.
        produtoService.deletar(id);
        return "Exclusão realizada com sucesso.";
    }
}
