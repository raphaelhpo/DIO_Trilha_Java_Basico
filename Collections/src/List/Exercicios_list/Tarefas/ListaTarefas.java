package List.Exercicios_list.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    List<Tarefa> tarefas;

    public ListaTarefas(){
        this.tarefas = new ArrayList<>();
    }
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
        for(int i = 0;i<tarefas.size();i++){
            System.out.println(tarefas.get(i));
        }
    }
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricaoesTarefas();

        listaTarefas.removerTarefa("Tarefa 2");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

    }
}