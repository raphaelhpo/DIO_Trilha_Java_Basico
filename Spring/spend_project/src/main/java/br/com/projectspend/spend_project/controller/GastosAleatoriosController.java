package br.com.projectspend.spend_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projectspend.spend_project.model.gastos.GastosAleatorios;
import br.com.projectspend.spend_project.service.GastosAleatoriosService;

@RestController
@RequestMapping("gastos/aleatorios")
public class GastosAleatoriosController {

    @Autowired
    GastosAleatoriosService service;

    @PostMapping
    public void saveGastoAleatorio(@RequestBody GastosAleatorios gastosFixos) {
        service.save(gastosFixos);
    }

}
