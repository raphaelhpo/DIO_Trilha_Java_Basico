package List.Exercicios_list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    List<Tarefa> tarefas = new ArrayList<>();

    /**@param tarefa descrição da tarefa
     * @return null Adiciona um valor à lista.
     **/
    public void adicionarTarefa(String tarefa){ 
        Tarefa f = new Tarefa(tarefa);
        tarefas.add(f);
    }


    public void removerTarefa(String descricao){
        //Remove uma tarefa da lista com base em sua descrição.
        
    }

    public int obterNumeroTotalTarefas(){
        //Retorna o número total de tarefas na lista.
        return tarefas.size();
    }

    public void obterDescricaoesTarefas(){
        //Retorna uma lista contendo a descrição de todas as tarefas na lista.
    }
}
class Tarefa{
    String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }
}