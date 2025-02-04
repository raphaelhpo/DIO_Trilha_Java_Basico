package com.dio.project.project_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dio.project.project_web.model.Cliente;
import com.dio.project.project_web.service.ClienteService;

@RestController
public class ClienteController {
    
    @Autowired
    ClienteService clienteService;

    @GetMapping
    public Iterable<Cliente> buscarTodos() {
        return clienteService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return clienteService.buscarPorId(id);
    }

    @PostMapping
    public void inserir(@RequestBody Cliente cliente) {
        clienteService.inserir(cliente);
    }
    
    @PutMapping
    public void atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        clienteService.atualizar(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteMethodName(@PathVariable Long id) {
        clienteService.deletar(id);
    }
}
