package br.com.projectspend.spend_project.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projectspend.spend_project.model.Usuario;
import br.com.projectspend.spend_project.model.gastos.GastosVariaveis;
import br.com.projectspend.spend_project.model.gastos.enums.TipoDeGasto;
import br.com.projectspend.spend_project.repository.GastosVariaveisRepository;
import br.com.projectspend.spend_project.repository.UsuarioRepository;
import br.com.projectspend.spend_project.service.GastosVariaveisService;
import jakarta.persistence.EntityNotFoundException;

@Service
public class GastosVariaveisServiceImp implements GastosVariaveisService {

    @Autowired
    GastosVariaveisRepository repository;
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void save(GastosVariaveis gastosVariaveis) {
        gastosVariaveis.setTipoGasto(TipoDeGasto.VARIAVEL);

        Usuario usuario = usuarioRepository.findById(gastosVariaveis.getUsuario().getId())
        .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));

        gastosVariaveis.setUsuario(usuario);

        repository.save(gastosVariaveis);
    }
    @Override
    public List<GastosVariaveis> getAll() {
        return repository.findAll();
    }
}
