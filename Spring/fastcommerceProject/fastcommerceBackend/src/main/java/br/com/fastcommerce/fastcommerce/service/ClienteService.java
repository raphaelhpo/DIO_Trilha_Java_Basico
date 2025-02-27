package br.com.fastcommerce.fastcommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.fastcommerce.fastcommerce.exceptions.CepNotExistsException;
import br.com.fastcommerce.fastcommerce.exceptions.ClienteNotExistsException;
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

    public void salvar(Cliente cliente) {
        if(viaCepClient.getEndereco(cliente.getEndereco().getCep()).getBairro() == null){
            throw new CepNotExistsException();
        }
        salvarClienteComEndereco(cliente);
    }

    public Optional<Cliente> buscarClientePorId(Long id) {
        if (!clienteRepository.existsById(id)){
            throw new ClienteNotExistsException();
        }
        else{
            return clienteRepository.findById(id);
        }
    }

    public Page<Cliente> buscarTodosClientes(Pageable page) {
        Pageable pageable = PageRequest.of(page.getPageNumber(), page.getPageSize());
        return clienteRepository.findAll(page);
    }

    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBanco = clienteRepository.findById(id);
        if (clienteBanco.isPresent()) {
            salvarClienteComEndereco(cliente);
        } else {
            throw new ClienteNotExistsException();
        }
    }

    public void deletar(Long id) {
        Optional<Cliente> clienteBanco = clienteRepository.findById(id);
        if (clienteBanco.isPresent()) {
            clienteRepository.deleteById(id);
        } else {
            throw new ClienteNotExistsException();
        }
    }

    private void salvarClienteComEndereco(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            // Caso não exista, integrar com o ViaCEP e persistir o retorno.
            Endereco novoEndereco = viaCepClient.getEndereco(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
