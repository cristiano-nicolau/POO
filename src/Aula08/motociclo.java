package Aula08;

public class motociclo {
    private String matricula;
    private String marca;
    private String modelo;
    private double potencia;
    private String tipo;

    public motociclo(String matricula, String marca, String modelo, double potencia, String tipo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.potencia=potencia;
        this.tipo=tipo;
    } 

    public String getmatricula(){
        return matricula;
    }

    public String getmarca(){
        return marca;
    }
    public String getmodelo(){
        return modelo;
    }
    public double getpotencia(){
        return potencia;
    }
    public String gettipo(){
        return tipo;
    }

    
}
