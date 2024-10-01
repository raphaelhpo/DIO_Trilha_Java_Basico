package Set.Exercicios_list.Cadastro;

import java.util.HashSet;
import java.util.Set;

public class CadastroProdutos {
    Set<Produto> produtos;

    public CadastroProdutos(){
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtos.add(new Produto(nome, preco, quantidade, cod));
    }

    public void exibirProdutosPorNome(){
    }

    public void exibirProdutosPorPreco(){
    }

}
