package br.com.projectspend.spend_project.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.projectspend.spend_project.dto.UsuarioDto;
import br.com.projectspend.spend_project.model.Usuario;

@Service
public interface UsuarioService {
    public void save(UsuarioDto usuarioDto);

    public List<Usuario> getAll();

    public Optional<Usuario> getForId(Long id);

    public void delete(Long id);

    public void put(Long id, UsuarioDto usuarioDto);
}
