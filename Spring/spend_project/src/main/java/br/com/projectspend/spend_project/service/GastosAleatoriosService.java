package br.com.projectspend.spend_project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.projectspend.spend_project.model.gastos.GastosAleatorios;

@Service
public interface GastosAleatoriosService {
    public void save(GastosAleatorios gastosAleatorios);

    public List<GastosAleatorios> getAll();
}
