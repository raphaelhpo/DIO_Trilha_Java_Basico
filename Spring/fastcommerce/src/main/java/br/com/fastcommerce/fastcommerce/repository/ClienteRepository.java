package br.com.fastcommerce.fastcommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fastcommerce.fastcommerce.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
