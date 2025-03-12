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

@Service
public class GastosVariaveisServiceImp implements GastosVariaveisService {

    @Autowired
    GastosVariaveisRepository repository;
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void save(GastosVariaveis gastosVariaveis) {
        gastosVariaveis.setTipoGasto(TipoDeGasto.VARIAVEL);

        Long usuarioId = gastosVariaveis.getUsuario().getId();

        Usuario usuario = usuarioRepository.findById(usuarioId)
        .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        gastosVariaveis.setUsuario(usuario);

        usuario.getGastosVariaveis().add(gastosVariaveis);

        repository.save(gastosVariaveis);
        usuarioRepository.save(usuario);
    }

    @Override
    public List<GastosVariaveis> getAll() {
        return repository.findAll();
    }
}
