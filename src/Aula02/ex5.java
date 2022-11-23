package Aula02;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        float v0,v1,d0,d1,media,t0,t1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduza a distacia do primeiro trajeto: ");
        d0=sc.nextFloat();
        System.out.println("Introduza a velocidade do primeiro trajeto: ");
        v0=sc.nextFloat();
        System.out.println("Introduza a distacia do segundo trajeto: ");
        d1=sc.nextFloat();
        System.out.println("Introduza a velocidade do segundo trajeto: ");
        v1=sc.nextFloat();
        sc.close();
        t0=d0/v0;
        t1=d1/v1;
        media=(d0+d1)/(t0+t1);
        System.out.printf("A velocidade média é de: %.2f",media);
    }
    
}
