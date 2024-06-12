package Collections.Map.Agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    // Atributo
    private Map<String, Integer> agendaContatoMap;

    // Construtor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void addContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer exibirNumero(String nome) {
        Integer numero = null;
        if(!agendaContatoMap.isEmpty()) {
            numero = agendaContatoMap.get(nome);
        }
        return numero;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.addContato("Ingrid", 263748);
        agendaContatos.addContato("Marcia", 938536);
        agendaContatos.addContato("Erika", 653428);
        agendaContatos.addContato("Ingrid", 765321);
        agendaContatos.addContato("Izabelle", 653428);
        agendaContatos.addContato("Adrielli", 549872);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Izabelle");
        agendaContatos.exibirContatos();

        System.out.println("O número do contato selecionado é: " + agendaContatos.exibirNumero("Ingrid"));

    }
}