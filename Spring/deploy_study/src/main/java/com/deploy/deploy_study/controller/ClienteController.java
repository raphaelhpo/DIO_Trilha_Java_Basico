package com.deploy.deploy_study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deploy.deploy_study.model.Cliente;
import com.deploy.deploy_study.service.ClienteService;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    public void save(Cliente cliente){
        clienteService.save(cliente);
    }

    @GetMapping
    public List<Cliente> getAllCliente() {
        return clienteService.getAllCliente();
    }
}
