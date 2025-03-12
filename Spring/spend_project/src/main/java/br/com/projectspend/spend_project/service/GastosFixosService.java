package br.com.projectspend.spend_project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.projectspend.spend_project.model.gastos.GastosFixos;

@Service
public interface GastosFixosService {
    public void save(GastosFixos gastosFixos);

    public List<GastosFixos> getAll();
}
