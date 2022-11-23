package Aula08;

import java.util.List;
import java.util.ArrayList;

public  class empresa {
    private List<automovel> veiculos = new ArrayList<>();
    private String nome;
    private String codigopostal;
    private String email;


    public empresa(String nome, String codigopostal, String email){
        this.nome=nome;
        this.codigopostal=codigopostal;
        this.email=email;
    } 

    public String getNome() {
        return nome;
    }
    public String getCodigopostal() {
        return codigopostal;
    }
    public String getEmail() {
        return email;
    }
    public void addautomovel(automovel v) {
	    this.veiculos.add(v);
	}
	
	public automovel getVeiculo(String matricula) {
		for (automovel v : veiculos) {
			if(v.getmatricula() == matricula) {
				return v;
			}
		}
		return null;
	}
}
