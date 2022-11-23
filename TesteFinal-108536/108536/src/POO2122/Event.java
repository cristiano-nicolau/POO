package POO2122;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Event  {
    private String name;
    private LocalDate date;
    private Set<Activity> activities=new TreeSet<>();
    public Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }
    public Event(Client c1, LocalDate parse) {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalDate getDate() {
        return date;
    }
    public Set<Activity> getActivities() {
        return activities;
    }
    public void setActivities(Set<Activity> atividade) {
        this.activities = atividade;
    }

    public Event addActivity(Activity atividade) {
        activities.add(atividade);
        return this;
    }
    
    @Override
    public String toString() {
        return "Evento "+this.getName()+" com as activities=" + activities + ", no dia" + date ;
    }
    @Override
    public int hashCode() {
        return Objects.hash(activities, date, name);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Event other = (Event) obj;
        return Objects.equals(activities, other.activities) && Objects.equals(date, other.date)
                && Objects.equals(name, other.name);
    }
    
}
