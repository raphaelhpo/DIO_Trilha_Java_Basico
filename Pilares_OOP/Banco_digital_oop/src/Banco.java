import java.util.ArrayList;
import Conta.Conta;

public class Banco {

    private String nome;
    ArrayList<Conta> contas;

    public Banco(){
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
