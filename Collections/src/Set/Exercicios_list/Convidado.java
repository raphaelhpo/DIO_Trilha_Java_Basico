package Set.Exercicios_list;

public class Convidado {
    private String nome;
    private int Codigo_Convite;

    public Convidado(String nome, int Codigo_Convite) {
        this.nome = nome;
        this.Codigo_Convite = Codigo_Convite;
    }
    public String getNome() {
        return nome;
    }

    public int getCodigo_Convite() {
        return Codigo_Convite;
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", Codigo_Convite=" + Codigo_Convite + "]";
    }
}
