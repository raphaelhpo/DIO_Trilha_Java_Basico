package br.com.projectspend.spend_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projectspend.spend_project.model.gastos.GastosVariaveis;

public interface GastosVariaveisRepository extends JpaRepository<GastosVariaveis, Long> {

}
