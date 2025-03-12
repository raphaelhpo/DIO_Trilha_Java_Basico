package br.com.projectspend.spend_project.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projectspend.spend_project.model.Usuario;
import br.com.projectspend.spend_project.model.gastos.GastosAleatorios;
import br.com.projectspend.spend_project.model.gastos.enums.TipoDeGasto;
import br.com.projectspend.spend_project.repository.GastosAleatoriosRepository;
import br.com.projectspend.spend_project.repository.UsuarioRepository;
import br.com.projectspend.spend_project.service.GastosAleatoriosService;
import jakarta.persistence.EntityNotFoundException;

@Service
public class GastosAleatoriosServiceImp implements GastosAleatoriosService {

    @Autowired
    GastosAleatoriosRepository repository;
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void save(GastosAleatorios gastosAleatorios) {
        gastosAleatorios.setTipoGasto(TipoDeGasto.ALEATORIO);

        Usuario usuario = usuarioRepository.findById(gastosAleatorios.getUsuario().getId())
        .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));

        gastosAleatorios.setUsuario(usuario);

        repository.save(gastosAleatorios);
    }

    @Override
    public List<GastosAleatorios> getAll() {
        return repository.findAll();
    }

}
