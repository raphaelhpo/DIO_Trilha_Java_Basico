package br.com.projectspend.spend_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projectspend.spend_project.model.gastos.GastosVariaveis;
import br.com.projectspend.spend_project.service.GastosVariaveisService;


@RestController
@RequestMapping("gastos/variaveis")
public class GastosVariaveisController {

    @Autowired
    GastosVariaveisService service;

    @PostMapping
    public void saveGastoVariavel(@RequestBody GastosVariaveis gastosVariaveis) {
        service.save(gastosVariaveis);
    }
    
    @GetMapping
    public List<GastosVariaveis> getAllGastosAleatorios() {
        return service.getAll();
    }
}
