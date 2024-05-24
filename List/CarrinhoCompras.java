package List;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    public static void main(String[] args) {

        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        System.out.println("-------------");
        System.out.println("BEM VINDO!");
        System.out.println(" ");
        System.out.println("NÚMERO TOTAL DE ITENS NO CARRINHO: " + carrinhoCompras.numbTotalItens());
        System.out.println("-------------");

        carrinhoCompras.addItem("Feijão");
        carrinhoCompras.addItem("Macarrão");
        carrinhoCompras.addItem("Arroz");
        carrinhoCompras.addItem("Refrigerante");
        System.out.println("O número atual de itens no carrinho é: " + carrinhoCompras.numbTotalItens());
        System.out.println("-------------");

        carrinhoCompras.rmvItem("Refrigerante");
        System.out.println("O número atual de itens no carrinho é: " + carrinhoCompras.numbTotalItens());
        System.out.println("-------------");
        
        System.out.println("ITENS NO CARRINHO: ");
        carrinhoCompras.descricaoItens();
        System.out.println("-------------");
    }

    private List<Item> itemList;

    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(String descricao) {
        System.out.println("!! ADICIONANDO NOVO ITEM !!");
        System.out.println("> " + descricao + " adicionado com sucesso.");
        itemList.add(new Item(descricao));
    }

    public void rmvItem(String descricao) {
        List<Item> itemRemove = new ArrayList<>();

        for(Item t : itemList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                itemRemove.add(t);
            }
        }
        System.out.println("!! REMOVENDO ITEM !!");
        System.out.println("> " + itemRemove +" removido com sucesso.");
        itemList.removeAll(itemRemove);
    }

    public int numbTotalItens() {
        return itemList.size();
    }

    public void descricaoItens() {
        System.out.println(itemList);
    }
}