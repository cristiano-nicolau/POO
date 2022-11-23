package Aula07;

public class Apartamento extends Alojamento {
    private String nquartos;

    public Apartamento(String Codigo,String Nome,String Local,boolean Disponibilidade,double Avaliacao){
        super(Codigo, Nome, Local, Disponibilidade, Avaliacao);
    }
    
    public String getQuartos(){
        return nquartos;
    }
}
