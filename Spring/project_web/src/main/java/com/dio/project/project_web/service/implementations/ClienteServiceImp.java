package com.dio.project.project_web.service.implementations;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dio.project.project_web.model.Cliente;
import com.dio.project.project_web.repository.ClienteRepository;
import com.dio.project.project_web.service.ClienteService;

public class ClienteServiceImp implements ClienteService {

    @Autowired
    ClienteRepository repository;

    @Override
    public Iterable<Cliente> buscarTodos() {
        // TODO Buscar todos os Clientes.
        return repository.findAll();
    }
    @Override
    public Cliente buscarPorId(Long id) {
        // TODO Buscar Cliente por ID.
        return repository.findById(id).get();
    }

    @Override
    public void inserir(Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inserir'");
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // TODO Buscar Cliente por ID, caso exista:
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void deletar(Long id) {
        // TODO  Deletar Cliente por ID.
        throw new UnsupportedOperationException("Unimplemented method 'deletar'");
    }

    

}
