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

@Service
public class GastosAleatoriosServiceImp implements GastosAleatoriosService {

    @Autowired
    GastosAleatoriosRepository repository;
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void save(Long id, GastosAleatorios gastosAleatorios) {
        gastosAleatorios.setTipoGasto(TipoDeGasto.ALEATORIO);

        Usuario usuario = usuarioRepository.findById(id).
        orElseThrow(() -> new RuntimeException("Usuário nao encontrado"));

        usuario.setGastosAleatorios(getAll());
        usuario.getGastosAleatorios().add(gastosAleatorios);
        
        repository.save(gastosAleatorios);
    }

    @Override
    public List<GastosAleatorios> getAll() {
        return repository.findAll();
    }

}
