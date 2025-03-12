package br.com.projectspend.spend_project.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projectspend.spend_project.dto.gastos.GastosFixosDTO;
import br.com.projectspend.spend_project.model.Usuario;
import br.com.projectspend.spend_project.model.gastos.GastosFixos;
import br.com.projectspend.spend_project.model.gastos.enums.TipoDeGasto;
import br.com.projectspend.spend_project.repository.GastosFixosRepository;
import br.com.projectspend.spend_project.repository.UsuarioRepository;
import br.com.projectspend.spend_project.service.GastosFixosService;
import jakarta.persistence.EntityNotFoundException;

@Service
public class GastosFixosServiceImp implements GastosFixosService{

    @Autowired
    GastosFixosRepository repository;
    @Autowired
    UsuarioRepository usuarioRepository;

    public void save(GastosFixos gastosFixos) {
        gastosFixos.setTipoGasto(TipoDeGasto.FIXO);

        Usuario usuario = usuarioRepository.findById(gastosFixos.getUsuario().getId())
        .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));

        gastosFixos.setUsuario(usuario);
        repository.save(gastosFixos);
    }

    @Override
    public List<GastosFixos> getAll() {
        return repository.findAll();
    }

    public GastosFixosDTO gastosFixosToDTO(GastosFixos gastosFixos){
        GastosFixosDTO gastosFixosDTO = new GastosFixosDTO();
        gastosFixosDTO.setId(gastosFixos.getId());
        gastosFixosDTO.setTipoGasto(gastosFixos.getTipoGasto());
        gastosFixosDTO.setNome(gastosFixos.getNome());
        gastosFixosDTO.setValor(gastosFixos.getValor());
        gastosFixosDTO.setData(gastosFixos.getData());
        gastosFixosDTO.setStatus(gastosFixos.getStatus());
        return gastosFixosDTO;
    }
}
