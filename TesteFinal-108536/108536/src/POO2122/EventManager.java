package POO2122;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class EventManager  {
    private String name;
    private Set<Client> clientes=new HashSet<>();
    private Set<Event> events=new TreeSet<>();

    public EventManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addClient(Client e) {
        return clientes.add(e);
    }

    public Client addClient(String string, String string2) {
        Client c=new Client(string, string2);
        clientes.add(c);
        return c;
    }

    public Event addEvent(Client c1, LocalDate parse) {
        Event e=new Event(c1, parse);
        events.add(e);
        return e;
    }
    public Set<Client> listClients() {
        return clientes;
    }

    public Set<Event> listEvents() {
        return events;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientes, events, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EventManager other = (EventManager) obj;
        return Objects.equals(clientes, other.clientes) && Objects.equals(events, other.events)
                && Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return "Evento "+ name +"com  "+clientes+" e os eventos " +events;
    }
    
}
