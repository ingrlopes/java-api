package Convidados;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.addConvidado("Alice", 1234);
        conjuntoConvidados.addConvidado("Bob", 1235);
        conjuntoConvidados.addConvidado("Charlie", 1235);
        conjuntoConvidados.addConvidado("David", 1236);
        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.removerConvidado(1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");
        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();
    }

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void addConvidado(String nome, int codConvite) {
        convidadosSet.add(new Convidado(nome, codConvite));
    }

    public void removerConvidado(int codConvite) {
        Convidado convidadoRemove = null;
        if (!convidadosSet.isEmpty()) {
            for (Convidado c : convidadosSet) {
                if (c.getCodConvite() == codConvite) {
                    convidadoRemove = c;
                    break;
                }       
            }
            convidadosSet.remove(convidadoRemove);
        } else {
        throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        if (!convidadosSet.isEmpty()) {
            System.out.println(convidadosSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
}