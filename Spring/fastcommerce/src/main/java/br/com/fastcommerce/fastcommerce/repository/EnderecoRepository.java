package br.com.fastcommerce.fastcommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fastcommerce.fastcommerce.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {
    
}
