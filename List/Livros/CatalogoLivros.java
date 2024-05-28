package List.Livros;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.addLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.addLivro("Livro 2", "Autor 2", 2021);
        catalogoLivros.addLivro("Livro 3", "Autor 3", 2022);
        catalogoLivros.addLivro("Livro 1", "Autor 2", 2023);
        catalogoLivros.addLivro("Livro 4", "Autor 4", 2024);

        System.out.println(catalogoLivros.pesquisarAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarAno(2020, 2022));
        System.out.println(catalogoLivros.pesquisarTitulo("Livro 1"));

    }

    private List<Livros> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void addLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livros(titulo, autor, anoPublicacao));
    }

    public List<Livros> pesquisarAutor(String autor) {
        List<Livros> autorLivros = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for(Livros l : livrosList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    autorLivros.add(l);
                }
            }
        }
        return autorLivros;
    }

    public List<Livros> pesquisarAno(int anoInicial, int anoFinal) {
        List<Livros> anoLivros = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for(Livros l : livrosList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    anoLivros.add(l);
                }
            }
        }
        return anoLivros;
    }

    public Livros pesquisarTitulo(String titulo) {
        Livros tituloLivros = null;
        if(!livrosList.isEmpty()) {
            for(Livros l : livrosList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    tituloLivros = l;
                    break;
                }
            }
        }
        return tituloLivros;
    }
}