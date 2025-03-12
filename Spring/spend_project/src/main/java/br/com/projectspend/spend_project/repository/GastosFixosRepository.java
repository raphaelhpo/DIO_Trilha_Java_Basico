package br.com.projectspend.spend_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projectspend.spend_project.model.gastos.GastosFixos;

public interface GastosFixosRepository extends JpaRepository<GastosFixos, Long> {

}
