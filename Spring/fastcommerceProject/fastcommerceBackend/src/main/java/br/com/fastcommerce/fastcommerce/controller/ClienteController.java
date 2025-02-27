package br.com.fastcommerce.fastcommerce.controller;

import java.util.Optional;

import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fastcommerce.fastcommerce.model.Cliente;
import br.com.fastcommerce.fastcommerce.service.ClienteService;

@RestController
@RequestMapping("clientes")
public class ClienteController {
    @Autowired
    ClienteService service;

    @PostMapping
    public ResponseEntity<String>  salvarCliente(@RequestBody Cliente cliente) {
        service.salvar(cliente);
        return ResponseEntity.ok("Cliente salvo com sucesso");
    }

    @GetMapping("/busca/{page}")
    public ResponseEntity<Page<Cliente>>  buscarClientes(@PathVariable Pageable page) {
        return ResponseEntity.ok(service.buscarTodosClientes(page));
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Cliente>> buscarCliente(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarClientePorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        service.atualizar(id, cliente);
        return ResponseEntity.ok("Cliente atualizado com sucesso.");
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCliente(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.ok("Cliente deletado com sucesso");
    }
}
