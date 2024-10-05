package Map.Exercicios_map.AgendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaDeContatos {

    Map<String, String> agenda;

    public AgendaDeContatos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, String telefone){
        agenda.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agenda.isEmpty()){
            agenda.remove(nome);
        }
        
    }

    public void exibirContatos(){
        if(!agenda.isEmpty()){
            System.out.println(agenda);
        }
    }

    public void pesquisaPorNome(String nome){
        if(!agenda.isEmpty()){
            System.out.println(agenda.get(nome));
        }
    }

    public static void main(String[] args) {

        AgendaDeContatos agenda = new AgendaDeContatos();
        agenda.adicionarContato("Joaquim", "11999999999");
        agenda.adicionarContato("Joaquim", "11999999999");
        agenda.adicionarContato("Paulo", "11999999999");
        agenda.adicionarContato("Jose", "11951166249");

        agenda.exibirContatos();
        agenda.removerContato("Joaquim");
        agenda.exibirContatos();
        
        agenda.pesquisaPorNome("Paulo");
        
    }
}
