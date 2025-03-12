package br.com.projectspend.spend_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projectspend.spend_project.model.gastos.GastosFixos;
import br.com.projectspend.spend_project.service.GastosFixosService;


@RestController
@RequestMapping("gastos/fixos")
public class GastosFixosController {

    @Autowired
    GastosFixosService service;

    @PostMapping
    public void saveGastoFixo(@RequestBody GastosFixos gastosFixos) {
        service.save(gastosFixos);
    }

    @GetMapping
    public List<GastosFixos> getAllGastosAleatorios() {
        return service.getAll();
    }
    
}
