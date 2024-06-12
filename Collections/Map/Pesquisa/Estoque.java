package Collections.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    // Atributo
    private Map<Long, Produto> estoqueMap;

    // Construtor
    public Estoque() {
        this.estoqueMap = new HashMap<>();
    }

    public void addProduto(long codigo, String nome, int quantidade, double preco) {
        estoqueMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueMap);
    }

    public double valorTotal() {
        double valorTotalEstoque = 0d;
        if(!estoqueMap.isEmpty()) {
            for(Produto p  : estoqueMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueMap.isEmpty()) {
            for(Produto p : estoqueMap.values()) {
                if(p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
    
    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        estoque.exibirProdutos();

        estoque.addProduto(1L, "Produto A", 10, 5.0);
        estoque.addProduto(2L, "Produto B", 5, 10.0);
        estoque.addProduto(3L, "Produto C", 2, 15.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.valorTotal());
        System.out.println("Produto mais caro: " + estoque.obterProdutoCaro());
    }
}