package Aula07;

public class Retangulo {
    private double c;
    private double a;
    private String cor;

    public Retangulo(double c, double a, String cor) {
        this.c = c;
        this.a = a;
        this.cor=cor;
    }

    public double getC() {
        return c;
    }

    public double getA() {
        return a;
    }

    public String getCor(){
        return cor;
    }

    public void setC(double c) {            
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String toString() {
		return "Retangulo [comprimento=" + c + ", altura=" + a + ", Area=" + Area() + ", Perimetro=" + Perimetro() + ", Cor=" + cor +  "]";
	}

    public double Area() {
		return (a * c);
	}
	
	public double Perimetro() {
		return (2*a + 2*c);
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
		
		Retangulo other = (Retangulo) obj;
		if (Double.doubleToLongBits(a) != Double.doubleToLongBits(other.a)) {
            return false;
        }
		if (Double.doubleToLongBits(c) != Double.doubleToLongBits(other.c)) {
            return false;
        }
		return true;
    }
}
