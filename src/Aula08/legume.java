package Aula08;

public class legume extends alimentos {
    private String nome;
    public legume(double proteinas,double peso, double calorias,String nome){
        super(proteinas, peso, calorias); this.nome=nome;
    }
    public String getNome() {
        return nome;
    }
    
}
