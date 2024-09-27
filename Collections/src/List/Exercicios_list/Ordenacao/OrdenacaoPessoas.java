package List.Exercicios_list.Ordenacao;
import java.util.ArrayList;
import java.util.List;


public class OrdenacaoPessoas {
    List<Pessoa> pessoas;

    public OrdenacaoPessoas(){
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasOrdenadas = new ArrayList<>(pessoas);
        Collection.sort(pessoasOrdenadas);
        return pessoasOrdenadas;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        Collection.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
}
