package List.Exercicios_list.Bibliotecas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> livros;

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
    
        // Exibindo livros pelo mesmo autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
    
        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));
    
        // Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));
    
        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));
    
        // Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));
    
        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
    }

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        //Adiciona um livro ao catálogo.
        livros.add(new Livro(titulo.toLowerCase(), autor.toLowerCase(), anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        //Pesquisa livros por autor e retorna uma lista com os livros encontrados.
        List<Livro> livros_do_autor = new ArrayList<>();

        if(livros.isEmpty()){
            return null;
        }else{
            for (Livro livro : livros) {
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livros_do_autor.add(livro);
                }
            }
        }
        return livros_do_autor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        //Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
        List<Livro> livros_periodo_ano = new ArrayList<>();

        if(livros.isEmpty()){
            return null;
        }else{
            for (Livro livro : livros) {
                if(livro.getAno() >= anoInicial && livro.getAno() <= anoFinal){
                    livros_periodo_ano.add(livro);
                }
            }
        }
        return livros_periodo_ano;
    }

    public Livro pesquisarPorTitulo(String titulo){
        //Pesquisa livros por título e retorna o primeiro livro encontrado.
        Livro livro_por_titulo = null;

        if(livros.isEmpty()){
            return null;
        }else{
            for(Livro livro : livros){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livro_por_titulo = livro;
                    break;
                }
            }
            return livro_por_titulo;
        }
    }
}
