package Set.Exercicios_list.Cadastro;

public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;
    private int quantidade;
    private long Codigo;

    public Produto(String nome, double preco, int quantidade, long Codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.Codigo = Codigo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public Long getCodigo() {
        return Codigo;
    }

    public void setCodigo(long codigo) {
        Codigo = codigo;
    }


    @Override
    public String toString() {
        return "Produto"+"-"+
        "  Nome:" + getNome() +
        " ,Preco:" + getPreco() +
        " ,Qtd:" + getQuantidade() +
        " ,Codigo:" + getCodigo();
    }


    @Override
    public int compareTo(Produto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
