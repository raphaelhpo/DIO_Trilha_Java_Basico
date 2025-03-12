package br.com.projectspend.spend_project.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projectspend.spend_project.model.Usuario;
import br.com.projectspend.spend_project.repository.UsuarioRepository;
import br.com.projectspend.spend_project.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    UsuarioRepository repository;

    @Override
    public List<Usuario> getAll() {
        // TODO Auto-generated method stub
        repository.findAll();
        return null;
    }

    @Override
    public Optional<Usuario> getForId(Long id) {
        // TODO Auto-generated method stub
        return repository.findById(id);
        
    }

    @Override
    public void save(Usuario usuario) {
        // TODO Auto-generated method stub
        repository.save(usuario);
    }

}
