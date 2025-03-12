package br.com.projectspend.spend_project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.projectspend.spend_project.model.gastos.GastosVariaveis;

@Service
public interface GastosVariaveisService {
    public void save(GastosVariaveis gastosVariaveis);

    public List<GastosVariaveis> getAll();
}
