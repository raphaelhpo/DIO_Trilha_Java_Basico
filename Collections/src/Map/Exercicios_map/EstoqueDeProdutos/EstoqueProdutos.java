package Map.Exercicios_map.EstoqueDeProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoque.put(cod ,new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println("\n");
        if(!estoque.isEmpty()){
            System.out.println(estoque);
        }
    }

    public double calcularValorTotalEstoque() {
        Double total = 0d;

        for(Produto p : estoque.values()){
            total += p.getPreco() * p.getQuantidade();
        }

        return total;
    }

    public Produto obterProdutoMaisCaro() {
        double valorAtual = 0d;
        Produto produtoMaisCaro = null;

        for(Produto p: estoque.values()){
            if(p.getPreco() > valorAtual){
                valorAtual = p.getPreco();
                produtoMaisCaro = p;
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        double valorAtual = 9999d;
        Produto produtoMaisBarato = null;

        for(Produto p: estoque.values()){
            if(p.getPreco() < valorAtual){
                valorAtual = p.getPreco();
                produtoMaisBarato = p;
            }
        }
        
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        int qtdAtual = 0;
        Produto produtoComMaisQuantidade = null;

        for(Produto p: estoque.values()){
            if(p.getQuantidade() > qtdAtual){
                qtdAtual = p.getQuantidade();
                produtoComMaisQuantidade = p;
            }
        }

        return produtoComMaisQuantidade;
    }
    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProduto(1L, "Coca-cola", 10, 5.5);
        estoque.adicionarProduto(2L, "Fanta", 8, 3.5);
        estoque.adicionarProduto(3L, "Sprite", 3, 8.5);
        estoque.adicionarProduto(4L, "Pepsi", 12, 10.5);
        estoque.exibirProdutos();

        System.out.println("Produto mais caro:"+estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato:"+estoque.obterProdutoMaisBarato());
        System.out.println("Produto com mais quantidade e valor total no estoque:"+estoque.calcularValorTotalEstoque());
        System.out.println("Produto com mais quantidade:"+estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
