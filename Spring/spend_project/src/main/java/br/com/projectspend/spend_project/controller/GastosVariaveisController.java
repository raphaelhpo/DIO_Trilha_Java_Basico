package br.com.projectspend.spend_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projectspend.spend_project.model.gastos.GastosVariaveis;
import br.com.projectspend.spend_project.service.GastosVariaveisService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/gastos/variaveis")
public class GastosVariaveisController {

    @Autowired
    GastosVariaveisService service;

    @PostMapping
    public void saveGastoVariavel(@RequestBody GastosVariaveis gastosVariaveis) {
        service.save(gastosVariaveis);
    }
    
}
