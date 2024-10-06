package Map.Exercicios_map.AgendaDeEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    
    private Map<LocalDate, Evento> agenda;

    public AgendaEventos(){
        this.agenda = new HashMap();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agenda.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> agendaTreeMap = new TreeMap<>(agenda);
        System.out.println(agendaTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> agendaTreeMap = new TreeMap<>(agenda);
        //Map.Entry<Key, Value>
        //O método .Entry é aplicado para manter a relação entre Key e value, e também libera o uso do get dos dois dados.
        for(Map.Entry<LocalDate, Evento> evento : agendaTreeMap.entrySet()){
            if(evento.getKey().isEqual(dataAtual) || evento.getKey().isAfter(dataAtual)){
                System.out.println("Proximo evento:"+evento.getValue()+"Acontecerá na data:"+evento.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {

        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2024, 12, 25), "Cinema", "A substância.");
        agenda.adicionarEvento(LocalDate.of(2024, 12, 26), "Futebol", "Fut com os guri.");
        agenda.adicionarEvento(LocalDate.of(2024, 12, 27), "Futebol", "Fut com a family.");
        agenda.adicionarEvento(LocalDate.of(2024, 12, 28), "Academia", "Pernas.");
        agenda.adicionarEvento(LocalDate.of(2024, 12, 29), "Academia", "Costas.");
        agenda.adicionarEvento(LocalDate.of(2024, 12, 30), "Academia", "Peito.");
        agenda.exibirAgenda();

        agenda.obterProximoEvento();
    }
}
