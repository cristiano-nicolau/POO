package Aula08;

public class pesadopassageiros {
    private String matricula;
    private String marca;
    private String modelo;
    private double nrquadro;
    private String peso;
    private String nrmaximopassageiros;

    public pesadopassageiros(String matricula, String marca, String modelo, double nrquadro, String peso,String nrmaximopassageiros){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.nrquadro=nrquadro;
        this.peso=peso;
        this.nrmaximopassageiros=nrmaximopassageiros;
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
    public double getnrquadro(){
        return nrquadro;
    }
    public String getpeso(){
        return peso;
    }
    public String getnrmaximopassageiros(){
        return nrmaximopassageiros;
    }


}
