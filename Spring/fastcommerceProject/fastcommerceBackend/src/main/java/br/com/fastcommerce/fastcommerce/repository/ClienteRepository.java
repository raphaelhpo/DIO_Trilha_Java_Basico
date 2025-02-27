package br.com.fastcommerce.fastcommerce.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fastcommerce.fastcommerce.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
    public Boolean findByEmail(String email);
    
    public Page<Cliente> findAll(Pageable pageable);
}
