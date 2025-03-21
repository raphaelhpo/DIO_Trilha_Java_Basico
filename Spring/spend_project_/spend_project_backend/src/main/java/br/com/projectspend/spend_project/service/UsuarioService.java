package br.com.projectspend.spend_project.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

<<<<<<< HEAD:Spring/spend_project_/spend_project_backend/src/main/java/br/com/projectspend/spend_project/service/UsuarioService.java
import br.com.projectspend.spend_project.dto.UsuarioDto;
=======
import br.com.projectspend.spend_project.dto.UsuarioDTO;
>>>>>>> ccbb4a492d0de6044889a02638d2d8e2b450e469:Spring/spend_project/src/main/java/br/com/projectspend/spend_project/service/UsuarioService.java
import br.com.projectspend.spend_project.model.Usuario;

@Service
public interface UsuarioService {
    public void save(UsuarioDto usuarioDto);

    public List<Usuario> getAll();

    public UsuarioDTO getForId(Long id);

    public void delete(Long id);

    public void put(Long id, UsuarioDto usuarioDto);
}
