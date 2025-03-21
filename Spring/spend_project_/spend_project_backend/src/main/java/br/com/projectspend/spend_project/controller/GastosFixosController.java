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

import br.com.projectspend.spend_project.dto.GastosFixosDto;
import br.com.projectspend.spend_project.model.gastos.GastosFixos;
import br.com.projectspend.spend_project.service.GastosFixosService;



@RestController
@RequestMapping("gastosFixos")
public class GastosFixosController {

    @Autowired
    GastosFixosService service;

    @PostMapping
    public void saveGastosFixos(@RequestBody GastosFixosDto gastosFixosDto) {
        service.save(gastosFixosDto);
    }
    
    @GetMapping
    public List<GastosFixos> getAll() {
        return service.getAll();
    }

    @PutMapping("{id}")
    public void putGastosFixos(@PathVariable Long id, @RequestBody GastosFixos gastosFixos) {
        service.putGastosFixos(id, gastosFixos);
    }

    @DeleteMapping("{id}")
    public void deleteGastoFixo(@PathVariable Long id) {
        service.deleteGastoFixo(id);
    }
}
