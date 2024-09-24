package List.Exercicios_list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    List<Tarefa> tarefas;

    public ListaTarefas(){
        this.tarefas = new ArrayList<>();
    }

    /**@param tarefa descrição da tarefa
     * @return null Adiciona um valor à lista.
     **/
    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        //Remove uma tarefa da lista com base em sua descrição.
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        
        for (Tarefa t : tarefasParaRemover) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefas.size();
    }

    public void obterDescricaoesTarefas(){
        //Retorna uma lista contendo a descrição de todas as tarefas na lista.
        System.out.println(tarefas);
    }
}