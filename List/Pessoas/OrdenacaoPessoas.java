package List.Pessoas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    public static void main(String[] args) {
        
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.addPessoa("Laura", 20, 1.56);
        ordenacaoPessoas.addPessoa("Izabelle", 30, 1.80);
        ordenacaoPessoas.addPessoa("Adrielli", 25, 1.70);
        ordenacaoPessoas.addPessoa("Ingrid", 17, 1.56);

        System.out.println(ordenacaoPessoas.ordenarIdade());
        System.out.println(ordenacaoPessoas.ordenarAltura());
    }

    private List<Pessoa> pessoaList;
    
    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void addPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarIdade() {
        List<Pessoa> idadePessoas = new ArrayList<>(pessoaList);
        Collections.sort(idadePessoas);
        return idadePessoas;
    }

    public List<Pessoa> ordenarAltura() {
        List<Pessoa> alturaPessoas = new ArrayList<>(pessoaList);
        Collections.sort(alturaPessoas, new ComparatorAltura());
        return alturaPessoas;
    }
}