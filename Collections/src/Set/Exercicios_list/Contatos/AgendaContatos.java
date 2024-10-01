package Set.Exercicios_list.Contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatos;

    public AgendaContatos(){
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        for(Contato contato: contatos){
            System.out.println(contato.toString());
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contato_atualizado = null;
        
        for(Contato contato: contatos){
            if(contato.getNome().equals(nome)){
                contato.setTelefone(novoNumero);
                contato_atualizado = contato;
                break;
            }
        }
        return contato_atualizado;
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatos_nome = new HashSet<>();
        System.out.println("\n");
        for(Contato contato: contatos){
            if(contato.getNome().startsWith(nome)){
                contatos_nome.add(contato);
            }
        }
        return contatos_nome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Alice", 123456);
        agendaContatos.adicionarContato("Bob", 789012);
        agendaContatos.adicionarContato("Charlie", 345678);
        agendaContatos.adicionarContato("David", 901234);
        agendaContatos.adicionarContato("Eve", 567890);

        agendaContatos.exibirContatos();

        agendaContatos.atualizarNumeroContato("Bob", 0);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Alice"));

    }
}
