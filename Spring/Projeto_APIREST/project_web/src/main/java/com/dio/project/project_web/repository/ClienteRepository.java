package com.dio.project.project_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dio.project.project_web.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
