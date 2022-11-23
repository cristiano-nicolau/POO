package Aula08;

public class peixe extends alimentos {
    private String tipo;

    public peixe(double proteinas,double peso, double calorias,String tipo){
        super(proteinas, peso, calorias);this.tipo=tipo;
    }

public String getTipo() {
    return tipo;
}
    
}


