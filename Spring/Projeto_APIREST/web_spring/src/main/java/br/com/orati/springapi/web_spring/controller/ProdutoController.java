package br.com.orati.springapi.web_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.orati.springapi.web_spring.model.entities.Produto;
import br.com.orati.springapi.web_spring.model.repositories.ProdutoRepository;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;
    
    @PostMapping(path = "/novo")
    public @ResponseBody Produto novoProduto(@RequestParam String nome){
        Produto produto = new Produto(nome);
        produtoRepository.save(produto);
        return produto;
    }

}
