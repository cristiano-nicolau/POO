package Aula07;

public class Alojamento {
    private String Codigo;
    private String Nome;
    private String Local;
    private boolean Disponibilidade;
    private double Avaliacao;
    public Alojamento(String Codigo,String Nome,String Local,boolean Disponibilidade,double Avaliacao){
        this.Codigo=Codigo;
        this.Nome=Nome;
        this.Local=Local;
        this.Disponibilidade=Disponibilidade;
        this.Avaliacao=Avaliacao;
    }
    
    public String getCodigo() {
        return Codigo;
    }
    public String getNome() {
        return Nome;
    }
    public String getLocal() {
        return Local;
    }
    public Boolean getDisponibilidade(){
        return Disponibilidade;
    }
    public double getAvaliacao() {
        return Avaliacao;
    }
}
