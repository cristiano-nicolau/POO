package Aula07;

public class QuartoHotel extends Alojamento{
    private String tipo;

    public QuartoHotel(String Codigo,String Nome,String Local,boolean Disponibilidade,double Avaliacao){
        super(Codigo, Nome, Local, Disponibilidade, Avaliacao);
    }

    public String gettipos(){
        return tipo;
    }
}
