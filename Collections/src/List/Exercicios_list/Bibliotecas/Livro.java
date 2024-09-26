package List.Exercicios_list.Bibliotecas;

public class Livro {
    private String titulo;
    private String autor;
    private String ano;

    public Livro(String titulo, String autor, String ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + "]";
    }

    
}
