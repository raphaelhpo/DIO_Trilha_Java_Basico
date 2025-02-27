package com.deploy.deploy_study.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deploy.deploy_study.model.Cliente;
import com.deploy.deploy_study.repository.ClienteRepository;
import com.deploy.deploy_study.service.ClienteService;

@Service
public class ClienteServiceImp implements ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void save(Cliente cliente){
        clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> getAllCliente(){
        return clienteRepository.findAll();
    }
}
