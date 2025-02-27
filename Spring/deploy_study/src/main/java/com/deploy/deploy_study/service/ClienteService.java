package com.deploy.deploy_study.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.deploy.deploy_study.model.Cliente;

@Service
public interface ClienteService {

    public void save(Cliente cliente);

    public List<Cliente> getAllCliente();

}
