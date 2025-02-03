package com.dio.project.project_web.service;

import org.springframework.stereotype.Service;

import com.dio.project.project_web.model.Cliente;

@Service
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
