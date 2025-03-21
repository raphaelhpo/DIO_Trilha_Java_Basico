package br.com.projectspend.spend_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projectspend.spend_project.dto.UsuarioDto;
import br.com.projectspend.spend_project.model.Usuario;
import br.com.projectspend.spend_project.service.UsuarioService;


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
    public Usuario getUsuarioForId(@PathVariable Long id) {
        return service.getForId(id).get();
    }

    @GetMapping
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

}
