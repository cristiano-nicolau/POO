package Aula05;

public class Ex3 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(new Ponto(1, 2), 3);
        Retangulo r1 =new Retangulo(5, 3);
        Triangulo t1 =new Triangulo(2, 1, 3);
        System.out.println(c1.toString());
        System.out.println(r1.toString());
        System.out.println(t1.toString());

    }
}
