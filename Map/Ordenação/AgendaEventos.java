package Map.Ordenação;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    // Atributo
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void addEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void proximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proxData = null;
        Evento proxEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proxData = entry.getKey();
                proxEvento = entry.getValue();
                System.out.println("O próximo evento: " + proxEvento + " acontecerá na data " + proxData);
                break;
            }
        }
    }

    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.addEvento(LocalDate.of(2024, 7, 15), "Evento 1", "Atração 1");
        agendaEventos.addEvento(LocalDate.of(2024, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.addEvento(LocalDate.of(2024, 1, 10), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();
        agendaEventos.proximoEvento();
    }
}
