package Aula07;

public class Empresa {
    private String  Nome;
    private String  Endereco;

    public Empresa(String  Nome,String  Endereco){
        this.Nome=Nome;
        this.Endereco=Endereco;
    }

    public String getNome(){
        return Nome;
    }
    public String getEndereco(){
        return Endereco;
    }
    public String toString() {
		return "Empresa: "+Nome+", "+ Endereco +"";
	}   
}
