package POO2122;

import java.util.Objects;

public class Activity {
    private int nrparticipantes;

    public Activity(int nrparticipantes) {
        this.nrparticipantes = nrparticipantes;
    }

    public int getNrparticipantes() {
        return nrparticipantes;
    }

    public void setNrparticipantes(int nrparticipantes) {
        this.nrparticipantes = nrparticipantes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrparticipantes);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Activity other = (Activity) obj;
        return nrparticipantes == other.nrparticipantes;
    }

    @Override
    public String toString() {
        return "Numero de Participantes =" + nrparticipantes ;
    }
    
}
