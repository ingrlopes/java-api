package Collections.List.Compras;
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
        carrinhoCompras.nomeItens();
        System.out.println("-------------");
    }

    private List<Item> itemList;

    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(String nome) {
        System.out.println("!! ADICIONANDO NOVO ITEM !!");
        System.out.println("> " + nome + " adicionado com sucesso.");
        itemList.add(new Item(nome));
    }

    public void rmvItem(String nome) {
        List<Item> itemRemove = new ArrayList<>();

        for(Item i : itemList) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itemRemove.add(i);
            }
        }
        System.out.println("!! REMOVENDO ITEM !!");
        System.out.println("> " + itemRemove +" removido com sucesso.");
        itemList.removeAll(itemRemove);
    }

    public int numbTotalItens() {
        return itemList.size();
    }

    public void nomeItens() {
        System.out.println(itemList);
    }
}