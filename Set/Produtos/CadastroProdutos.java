package Produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    // Atributo
    private Set<Produto> produtoSet;

    // Construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    
    public void addProduto (long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirNome() {
        Set<Produto> nomeProdutos = new TreeSet<>(produtoSet);
        return nomeProdutos;
    }

    public Set<Produto> exibirPreco() {
        Set<Produto> precoProdutos = new TreeSet<>(new ComparatorPreco());
        precoProdutos.addAll(produtoSet);
        return precoProdutos;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();
    
        cadastroProdutos.addProduto(1L, "Arroz", 15d, 5);
        cadastroProdutos.addProduto(2L, "Macarrão", 20d, 10);
        cadastroProdutos.addProduto(5L, "Feijão", 10d, 2);
        cadastroProdutos.addProduto(9L, "Ovo", 2d, 2);
    
        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibirNome());
        System.out.println(cadastroProdutos.exibirPreco());
        
    }
}