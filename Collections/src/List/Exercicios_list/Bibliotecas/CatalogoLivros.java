package List.Exercicios_list.Bibliotecas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        //Adiciona um livro ao catálogo.
        livros.add(new Livro(titulo.toLowerCase(), autor.toLowerCase(), Integer.toString(anoPublicacao)));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        //Pesquisa livros por autor e retorna uma lista com os livros encontrados.
        if(livros.isEmpty()){
            return null;
        }else{
            private List<Livro> livros_do_autor = new ArrayList<>();

            for (Livro livro : livros) {
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livros_do_autor.add(livro);
                }
            }
            return livros_do_autor.toString();
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        //Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
        private List<Livro> livros_periodo_ano = new ArrayList<>();
        if(livros.isEmpty()){
            return null;
        }else{
            for (Livro livro : livros) {
                if(livro.getAno() <= anoFinal && livro.getAno() >= anoInicial){
                    livros_periodo_ano.add(livros_periodo_ano);
    
                }
            }
            return livros_periodo_ano.toString();
        }
    }

    public void pesquisarPorTitulo(String titulo){
        //Pesquisa livros por título e retorna o primeiro livro encontrado.
        Livro livro_por_titulo = null;
        if(livros.isEmpty()){
            return null;
        }else{
            for(Livro livro : livros){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livro_por_titulo = livro;
                    return livro_por_titulo;
                    break;
                }
            }
        }
    }
}
