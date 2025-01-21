package br.com.orati.springapi.web_spring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.orati.springapi.web_spring.model.entities.Produto;
import br.com.orati.springapi.web_spring.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;
    
    @RequestMapping(method= {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }
    @GetMapping(path = "/listar")
    public Iterable<Produto> ListarProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/procurar/{id}")
    public Optional<Produto> Procurar(@PathVariable int id) {
        return produtoRepository.findById(id);
    }

    @DeleteMapping(path="/{id}")
    public void excluirProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }
}