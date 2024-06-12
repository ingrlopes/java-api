package Collections.List.Livros;

public class Livros {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livros(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String toString() {
        return "Livro {" +
                "titulo= " + titulo + '\'' +
                ", autor= " + autor + '\'' +
                ", ano publicação= " + anoPublicacao +
                '}';
    }
}