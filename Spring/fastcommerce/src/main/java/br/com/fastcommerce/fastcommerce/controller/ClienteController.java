package br.com.fastcommerce.fastcommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fastcommerce.fastcommerce.model.Cliente;
import br.com.fastcommerce.fastcommerce.service.ClienteService;
import feign.Response;

@RestController
@RequestMapping("clientes")
public class ClienteController {
    @Autowired
    ClienteService service;

    @PostMapping
    public void salvar(@RequestBody Cliente cliente) {
        service.salvarCliente(cliente);
    }

    @GetMapping
    public List<Cliente> buscarTodosClientes(@RequestParam String param) {
        return service.buscarTodosClientes();
    }
    
    @GetMapping("/{id}")
    public Optional<Cliente> buscarCliente(@PathVariable Long id) {
        return service.buscarClientePorId(id);
    }

    @PutMapping
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }
    
    @DeleteMapping
    public String deleteMethodName(@PathVariable String id) {
        //TODO: process DELETE request
        
        return id;
    }
}
