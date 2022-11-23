package Aula08;

public class alimentos {
    private double proteinas;
    private double peso;
    private double calorias;


    public alimentos(double proteinas,double peso, double calorias){
        this.calorias=calorias;this.peso=peso;this.proteinas=proteinas;}

    public double getCalorias() {
        return calorias;
    }
    public double getPeso() {
        return peso;
    }
    public double getProteinas() {
        return proteinas;
    }
}
