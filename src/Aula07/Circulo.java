package Aula07;

public class Circulo {
    private double raio;
    private Ponto centro;
    private String cor;


    public Circulo(Ponto centro, double raio, String cor) {
        this.raio = raio;
        this.centro = centro;
        this.cor=cor;

    }

    public double getRaio() {
        return raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    public String getCor(){
        return cor;
    }

    public String toString() {
		return "Circulo [raio=" + raio + ", centro=" + centro + ", Area=" + Area() + ", Perimetro=" + Perimetro() + ", Cor=" + cor +"]";
	}

    public double Area() {
        return (Math.PI * (Math.pow(this.raio, 2)));
    }

    public double Perimetro() {
        return (2 * Math.PI * this.raio);
    }

    public boolean equals(Object obj) {
		if (this == obj) {
            return true;
        }
		if (obj == null) {
            return false;
        }
		if (getClass() != obj.getClass()) {
            return false;
        }

		Circulo other = (Circulo) obj;
		if (centro == null) {
			if (other.centro != null) {
                return false;
            }
		} else if (!centro.equals(other.centro)) {
            return false;
        }
		if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio)) {
            return false;
        }
		return true;
	}
}
