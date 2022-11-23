package Aula02;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        float p1x,p1y,p2x,p2y;
        Scanner sc= new Scanner(System.in);
        System.out.println("Coordenadas P1:");
        System.out.println("X:");
        p1x=sc.nextFloat();
        System.out.println("Y:");
        p1y=sc.nextFloat();
        System.out.println("Coordenadas P2:");
        System.out.println("X:");
        p2x=sc.nextFloat();
        System.out.println("Y:");
        p2y=sc.nextFloat();
        sc.close();
        double X=Math.pow((p2x-p1x), 2);
        double Y=Math.pow((p2y-p1y), 2);
        double dst=Math.sqrt((X+Y));
        System.out.println("Distancia media entre os 2 pontos é: "+dst);
    }
    
}
