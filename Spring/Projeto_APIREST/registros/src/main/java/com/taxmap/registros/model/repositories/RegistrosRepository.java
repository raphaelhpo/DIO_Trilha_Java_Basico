package com.taxmap.registros.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taxmap.registros.model.entities.Registros;

public interface RegistrosRepository extends JpaRepository<Registros, Long> {

}
