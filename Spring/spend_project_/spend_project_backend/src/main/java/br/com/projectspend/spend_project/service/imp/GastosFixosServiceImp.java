package br.com.projectspend.spend_project.service.imp;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projectspend.spend_project.dto.GastosFixosDto;
import br.com.projectspend.spend_project.model.Usuario;
import br.com.projectspend.spend_project.model.gastos.GastosFixos;
import br.com.projectspend.spend_project.model.gastos.enums.StatusGasto;
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

    @Override
    public void save(GastosFixosDto gastosFixosDto) {
        //Buscar o usuário pelo ID indicado
        Long usuarioId = gastosFixosDto.getUsuarioId();
        Usuario usuario = usuarioRepository.findById(usuarioId)
        .orElseThrow(() -> new RuntimeException("Usuário nao encontrado"));

        //Criar o gasto fixo relacionado ao usuário indicado
        GastosFixos gastosFixos = gastosFixosToDto(usuario, gastosFixosDto);

        //Adicionar Campos automáticos
        gastosFixos.setTipoGasto(TipoDeGasto.FIXO);
        gastosFixos.setStatus(StatusGasto.PENDENTE);
        gastosFixos.setData(LocalDate.now());

        //Adicionar o gasto fixo ao usuário
        usuario.getGastosFixos().add(gastosFixos);

        //Salvar
        repository.save(gastosFixos);

        /*
         *3°Verificar data:
         *3.1°Criar alguma validação de data.
         *3.2°Qualquer ação realizada, atualiza a data.
         *4°Salvar.
         */
    }

    @Override
    public List<GastosFixos> getAll() {
        return repository.findAll();
    }

    @Override
    public void putGastosFixos(Long id, GastosFixos gastosFixos) {
        if(repository.existsById(id)){
            repository.save(gastosFixos);
        }else{
            throw new RuntimeException("Gasto Fixo nao encontrado");
        }
    }

    @Override
    public void deleteGastoFixo(Long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
        }else{
            throw new RuntimeException("Gasto Fixo nao encontrado");
        }
    }

    public GastosFixos gastosFixosToDto(Usuario usuario, GastosFixosDto gastosFixosDto) {
        GastosFixos gastosFixos = new GastosFixos();

        gastosFixos.setNome(gastosFixosDto.getNome());
        gastosFixos.setValor(gastosFixosDto.getValor());
        gastosFixos.setUsuario(usuario);
        gastosFixos.getUsuario().setId(gastosFixosDto.getUsuarioId());

        return gastosFixos;
    }

}
