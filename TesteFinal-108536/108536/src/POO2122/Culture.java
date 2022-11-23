package POO2122;


public class Culture extends Activity {
    private Option Tipo;
    private static int preco=20;
    private double val=0;
    public enum Option {
        ART_MUSEUM, RIVER_TOUR,ARCHITECTURAL_TOUR,WINE_TASTING
    }
    public Culture(Option tipo,int nrparticipantes) {
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
        Culture.preco = preco;
    }
    @Override
    public String toString() {
        return "Culture [Tipo=" + Tipo + "]";
    }
    public double getVal(int nrparticipantes) {
        return nrparticipantes*preco;
    }


}
