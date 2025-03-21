package br.com.projectspend.spend_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.projectspend.spend_project.dto.UsuarioDTO;
import br.com.projectspend.spend_project.dto.UsuarioDto;
import br.com.projectspend.spend_project.model.Usuario;
import br.com.projectspend.spend_project.service.UsuarioService;
>>>>>>> ccbb4a492d0de6044889a02638d2d8e2b450e469:Spring/spend_project/src/main/java/br/com/projectspend/spend_project/controller/UsuarioController.java




@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @PostMapping
    public void saveUsuario(@RequestBody UsuarioDto usuarioDto) {
        service.save(usuarioDto);
    }

    @GetMapping("{id}")
    public UsuarioDTO getUsuarioForId(@PathVariable Long id) {
        return service.getForId(id);
    }

    @GetMapping
<<<<<<< HEAD:Spring/spend_project_/spend_project_backend/src/main/java/br/com/projectspend/spend_project/controller/UsuarioController.java
    public List<Usuario> getUsuarioForId() {
        return service.getAll();
    }
    
    @PutMapping("{id}")
    public void putUsuario(@PathVariable Long id, @RequestBody UsuarioDto usuarioDto) {
        service.put(id, usuarioDto);
    }

    @DeleteMapping("{id}")
    public void deleteUsuario(@PathVariable Long id) {
        service.delete(id);
    }

=======
    public List<Usuario> getUsuarios() {
        return service.getAll();
    }
    
>>>>>>> ccbb4a492d0de6044889a02638d2d8e2b450e469:Spring/spend_project/src/main/java/br/com/projectspend/spend_project/controller/UsuarioController.java
}
