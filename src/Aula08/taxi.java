package Aula08;

public class taxi extends automovel {
    private double nrlicenca;
    public taxi(String matricula, String marca, String modelo, double nrquadro, String bagageira, double nrlicenca){
        super(matricula, marca, modelo, nrquadro, bagageira);
        this.nrlicenca=nrlicenca;
    }
    public double getnrlicenca(){
        return nrlicenca;
    }
    
}
