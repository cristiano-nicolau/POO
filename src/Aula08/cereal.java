package Aula08;

public class cereal extends alimentos {
    private String nome;
    public cereal(double proteinas,double peso, double calorias,String nome){
        super(proteinas, peso, calorias); this.nome=nome;
    }
    public String getNome() {
        return nome;
    }
    
}
