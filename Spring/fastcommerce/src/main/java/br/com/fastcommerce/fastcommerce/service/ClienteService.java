package br.com.fastcommerce.fastcommerce.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fastcommerce.fastcommerce.model.Cliente;
import br.com.fastcommerce.fastcommerce.repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository repository;

    public void salvarCliente(Cliente cliente) {
        repository.save(cliente);
    }

    public Optional<Cliente> buscarClientePorId(Long id) {
        return repository.findById(id);
    }

    public List<Cliente> buscarTodosClientes() {
        return repository.findAll();
    }
}
