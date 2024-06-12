package Collections.Map.Pesquisa;

public class Produto {

    // Atributos
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public String toString() {
        return "[" + nome +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                "]";
    }
}