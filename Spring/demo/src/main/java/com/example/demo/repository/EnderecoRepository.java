package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Endereco;
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {

}
