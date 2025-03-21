package br.com.projectspend.spend_project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.projectspend.spend_project.dto.GastosFixosDto;
import br.com.projectspend.spend_project.model.gastos.GastosFixos;

@Service
public interface GastosFixosService {
    public void save(GastosFixosDto gastosFixosDto);

    public List<GastosFixos> getAll();

    public void putGastosFixos(Long id, GastosFixos gastosFixos);

    public void deleteGastoFixo(Long id);
}
