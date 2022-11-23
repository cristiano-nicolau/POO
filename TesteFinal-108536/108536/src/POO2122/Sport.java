package POO2122;

public class Sport extends Activity {
    private Modality Tipo;
    private static int preco=25;
    public enum Modality {
        KAYAK, HIKING,BIKE
    }
    public Sport( Modality tipo,int nrparticipantes) {
        super(nrparticipantes);
        this.Tipo = tipo;
    }
    public Modality getTipo() {
        return Tipo;
    }
    public void setTipo(Modality tipo) {
        Tipo = tipo;
    }
    public static int getPreco() {
        return preco;
    }
    public static void setPreco(int preco) {
        Sport.preco = preco;
    }
    public double getVal(int nrparticipantes) {
        return nrparticipantes*preco;
    }
    @Override
    public String toString() {
        return "Sport do tipo " + Tipo + ", participantes=" + getNrparticipantes() ;
    }

    
}
