package br.com.projectspend.spend_project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projectspend.spend_project.model.Usuario;
import br.com.projectspend.spend_project.service.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @PostMapping
    public void saveUsuario(@RequestBody Usuario usuario) {
        service.save(usuario);
    }

    @GetMapping("{id}")
    public Optional<Usuario> getUsuarioForId(@PathVariable Long id) {
        return service.getForId(id);
    }
}
