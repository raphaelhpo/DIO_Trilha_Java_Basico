package Set.Exercicios_list.Convidados;

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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Codigo_Convite;
        
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (Codigo_Convite != other.Codigo_Convite)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", Codigo_Convite=" + Codigo_Convite + "]";
    }
}
