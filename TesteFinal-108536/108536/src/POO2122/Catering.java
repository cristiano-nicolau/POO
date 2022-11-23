package POO2122;

import java.util.Objects;

public class Catering extends Activity {
    private Option Tipo;
    private static int preco=30;
    public enum Option {
        LIGHT_BITES, FULL_MENU, DRINKS_AND_SNACKS
    }
    public Catering( Option tipo,int nrparticipantes) {
        super(nrparticipantes);
        Tipo = tipo;
    }
    public Option getTipo() {
        return Tipo;
    }
    public void setTipo(Option tipo) {
        Tipo = tipo;
    }
    public static int getPreco() {
        return preco;
    }
    public static void setPreco(int preco) {
        Catering.preco = preco;
    }
    public double getVal(int nrparticipantes) {
        return nrparticipantes*preco;
    }
    @Override
    public int hashCode() {
        return Objects.hash(Tipo);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Catering other = (Catering) obj;
        return Objects.equals(Tipo, other.Tipo);
    }

}
