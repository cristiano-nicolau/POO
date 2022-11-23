package Aula08;

public class carne extends alimentos {
    
    private String variedade;

    public carne(double proteinas,double peso, double calorias,String variedade){
        super(proteinas, peso, calorias);this.variedade=variedade;
    }

    public String getVariedade() {
        return variedade;
    }
    
}
