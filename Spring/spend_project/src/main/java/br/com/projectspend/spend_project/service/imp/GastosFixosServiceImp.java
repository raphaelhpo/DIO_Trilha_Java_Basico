package br.com.projectspend.spend_project.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projectspend.spend_project.model.Usuario;
import br.com.projectspend.spend_project.model.gastos.GastosFixos;
import br.com.projectspend.spend_project.model.gastos.enums.TipoDeGasto;
import br.com.projectspend.spend_project.repository.GastosFixosRepository;
import br.com.projectspend.spend_project.repository.UsuarioRepository;
import br.com.projectspend.spend_project.service.GastosFixosService;

@Service
public class GastosFixosServiceImp implements GastosFixosService{

    @Autowired
    GastosFixosRepository repository;
    @Autowired
    UsuarioRepository usuarioRepository;

    public void save(GastosFixos gastosFixos) {
        
        gastosFixos.setTipoGasto(TipoDeGasto.FIXO);

        Long usuarioId = gastosFixos.getUsuario().getId();

        Usuario usuario = usuarioRepository.findById(usuarioId)
        .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        gastosFixos.setUsuario(usuario);

        usuario.getGastosFixos().add(gastosFixos);

        repository.save(gastosFixos);
        usuarioRepository.save(usuario);
    }

    public List<GastosFixos> getAll() {
        return repository.findAll();
    }
}
