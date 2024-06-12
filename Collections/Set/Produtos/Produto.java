package Produtos;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    // Atributos
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    // Comparação
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    // Construtor
    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos getter 
    public long getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    // Pegar código duplicado
    public int hashCode() {
        return Objects.hash(getCodigo());
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    public String toString() {
        return "[Codigo=" + codigo +
            ", nome=" + nome +
            ", preco=" + preco +
            ", quantidade=" + quantidade +
            "]";
    }
}

class ComparatorPreco implements Comparator<Produto> {

    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}