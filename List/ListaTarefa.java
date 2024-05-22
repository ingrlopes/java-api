package List;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("-------------");
        System.out.println("BEM VINDO!");
        System.out.println(" ");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.numbTotalTarefas());
        System.out.println("-------------");

        listaTarefa.addTarefa("Tarefa 1");
        listaTarefa.addTarefa("Tarefa 2");
        listaTarefa.addTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.numbTotalTarefas());
        System.out.println("-------------");

        listaTarefa.rmvTarefa("Tarefa 3");
        System.out.println("O número atual de elementos na lista é: " + listaTarefa.numbTotalTarefas());
        System.out.println("-------------");
        
        System.out.println("DESCRIÇÃO TAREFAS: ");
        listaTarefa.descricoesTarefas();
        System.out.println("-------------");
    }

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void addTarefa(String descricao) {
        System.out.println("!! ADICIONANDO TAREFA !!");
        tarefaList.add(new Tarefa(descricao));
    }

    public void rmvTarefa(String descricao) {
        List<Tarefa> tarefaRemove = new ArrayList<>();

        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaRemove.add(t);
            }
        }
        System.out.println("!! REMOVENDO TAREFA !!");
        tarefaList.removeAll(tarefaRemove);
    }

    public int numbTotalTarefas() {
        return tarefaList.size();
    }

    public void descricoesTarefas() {
        System.out.println(tarefaList);
    }
}