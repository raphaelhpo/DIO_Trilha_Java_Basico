package br.com.projectspend.spend_project.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.projectspend.spend_project.dto.UsuarioDTO;
import br.com.projectspend.spend_project.model.Usuario;

@Service
public interface UsuarioService {
    public void save(Usuario usuario);

    public List<Usuario> getAll();

    public UsuarioDTO getForId(Long id);

}
