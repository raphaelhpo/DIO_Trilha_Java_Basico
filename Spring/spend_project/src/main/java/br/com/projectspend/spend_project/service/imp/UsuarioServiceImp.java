package br.com.projectspend.spend_project.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projectspend.spend_project.dto.UsuarioDTO;
import br.com.projectspend.spend_project.model.Usuario;
import br.com.projectspend.spend_project.repository.GastosFixosRepository;
import br.com.projectspend.spend_project.repository.UsuarioRepository;
import br.com.projectspend.spend_project.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    UsuarioRepository repository;
    @Autowired
    GastosFixosRepository gastosFixosRepository;
    @Autowired


    @Override
    public List<Usuario> getAll() {
        return repository.findAll();
    }

    @Override
    public UsuarioDTO getForId(Long id){
        Usuario usuario = repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        return usuarioToDTO(usuario);
    }

    @Override
    public void save(Usuario usuario) {
        repository.save(usuario);
    }

    public UsuarioDTO usuarioToDTO(Usuario usuario){
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setId(usuario.getId());
        usuarioDTO.setName(usuario.getName());
        usuarioDTO.setRenda(usuario.getRenda());
        usuarioDTO.setDataVigente(usuario.getDataVigente());
        return usuarioDTO;
    }
}
