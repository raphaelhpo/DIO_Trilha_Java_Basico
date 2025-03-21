package br.com.projectspend.spend_project.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projectspend.spend_project.dto.UsuarioDto;
import br.com.projectspend.spend_project.model.Usuario;
import br.com.projectspend.spend_project.repository.UsuarioRepository;
import br.com.projectspend.spend_project.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    UsuarioRepository repository;

    @Override
    public List<Usuario> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Usuario> getForId(Long id) {
        return repository.findById(id);
        
    }

    @Override
    public void save(UsuarioDto usuarioDto) {
        repository.save(usuarioToDto(usuarioDto));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void put(Long id, UsuarioDto usuarioDto) {
        repository.save(usuarioToDto(usuarioDto));
    }

    public Usuario usuarioToDto(UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioDto.getNome());
        usuario.setRenda(usuarioDto.getRenda());
        usuario.setDataVigente(usuarioDto.getDataVigente());
        return usuario;
    }
}
