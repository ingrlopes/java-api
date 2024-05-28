package Contatos;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos(null);

        agendaContatos.exibirContato();
        agendaContatos.addContato("Izabelle", 1987634);
        agendaContatos.addContato("Erika", 9875249);
        agendaContatos.addContato("Adrielli", 9825314);
        agendaContatos.addContato("Laura", 9969747);
        agendaContatos.addContato("Marcia", 9891510);

        System.out.println(agendaContatos.pesquisarContato("Marcia"));
        System.out.println("Contato atualizado: " + agendaContatos.atualizarContato("Laura", 9087524));
        agendaContatos.exibirContato();
    }

    private Set<Contato> contatoSet;

    public AgendaContatos(Set<Contato> contatoSet) {
        this.contatoSet = new HashSet<>();
    }

    public void addContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarContato(String nome) {
        Set<Contato> nomeContatos = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                nomeContatos.add(c);
            }
        }
        return nomeContatos;
    }

    public Contato atualizarContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}