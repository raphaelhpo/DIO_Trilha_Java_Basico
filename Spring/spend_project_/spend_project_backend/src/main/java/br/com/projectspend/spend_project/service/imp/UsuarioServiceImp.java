package br.com.projectspend.spend_project.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD:Spring/spend_project_/spend_project_backend/src/main/java/br/com/projectspend/spend_project/service/imp/UsuarioServiceImp.java
import br.com.projectspend.spend_project.dto.UsuarioDto;
=======
import br.com.projectspend.spend_project.dto.UsuarioDTO;
>>>>>>> ccbb4a492d0de6044889a02638d2d8e2b450e469:Spring/spend_project/src/main/java/br/com/projectspend/spend_project/service/imp/UsuarioServiceImp.java
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
<<<<<<< HEAD:Spring/spend_project_/spend_project_backend/src/main/java/br/com/projectspend/spend_project/service/imp/UsuarioServiceImp.java
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
=======
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
>>>>>>> ccbb4a492d0de6044889a02638d2d8e2b450e469:Spring/spend_project/src/main/java/br/com/projectspend/spend_project/service/imp/UsuarioServiceImp.java
    }
}
