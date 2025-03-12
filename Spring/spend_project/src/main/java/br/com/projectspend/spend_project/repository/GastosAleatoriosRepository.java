package br.com.projectspend.spend_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projectspend.spend_project.model.gastos.GastosAleatorios;

public interface GastosAleatoriosRepository extends JpaRepository<GastosAleatorios, Long>{

}
