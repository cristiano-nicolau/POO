package Aula08;

import java.util.Objects;

public class automovel {
    private String matricula;
    private String marca;
    private String modelo;
    private double nrquadro;
    private String bagageira;

    public automovel(String matricula, String marca, String modelo, double nrquadro, String bagageira) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.nrquadro = nrquadro;
        this.bagageira = bagageira;
    }

    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getNrquadro() {
        return nrquadro;
    }

    public void setNrquadro(double nrquadro) {
        this.nrquadro = nrquadro;
    }

    public String getBagageira() {
        return bagageira;
    }


    public void setBagageira(String bagageira) {
        this.bagageira = bagageira;
    }


    
    @Override
    public int hashCode() {
        return Objects.hash(bagageira, marca, matricula, modelo, nrquadro);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        automovel other = (automovel) obj;
        return Objects.equals(bagageira, other.bagageira) && Objects.equals(marca, other.marca)
                && Objects.equals(matricula, other.matricula) && Objects.equals(modelo, other.modelo)
                && Double.doubleToLongBits(nrquadro) == Double.doubleToLongBits(other.nrquadro);
    }

    
}
