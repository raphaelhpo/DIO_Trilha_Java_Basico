package br.com.projectspend.spend_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projectspend.spend_project.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
