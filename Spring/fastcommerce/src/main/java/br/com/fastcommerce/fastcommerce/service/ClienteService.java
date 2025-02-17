package br.com.fastcommerce.fastcommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fastcommerce.fastcommerce.model.Cliente;
import br.com.fastcommerce.fastcommerce.model.Endereco;
import br.com.fastcommerce.fastcommerce.repository.ClienteRepository;
import br.com.fastcommerce.fastcommerce.repository.EnderecoRepository;
import br.com.fastcommerce.fastcommerce.service.client.ViaCepClient;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    EnderecoRepository enderecoRepository;
    @Autowired
    ViaCepClient viaCepClient;
    public void salvarCliente(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepClient.getEndereco(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        clienteRepository.save(cliente);
    }

    public Optional<Cliente> buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    public List<Cliente> buscarTodosClientes() {
        return clienteRepository.findAll();
    }
}
