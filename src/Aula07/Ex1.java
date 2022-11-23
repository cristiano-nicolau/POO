package Aula07;

public class Ex1 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(new Ponto(1, 2), 3,"Azul");
        Circulo c2 = new Circulo(new Ponto(2, 3), 4,"Azul");
        Retangulo r1 = new Retangulo(3, 6,"Vermelho");
        Retangulo r2 = new Retangulo(3, 6,"Vermelho");
        Triangulo t1 = new Triangulo(2, 4, 5,"Rosa");

        System.out.println(c1.toString());
        System.out.println(r1.toString());
        System.out.println(t1.toString());
        System.out.println(c1.equals(c2));
        System.out.println(r1.equals(r2));
    }
    
}

