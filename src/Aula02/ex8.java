package Aula02;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        double cA,cB,H;
        Scanner sc= new Scanner(System.in);
        System.out.println("Cateto A:");
        cA=sc.nextDouble();
        System.out.println("Cateto B:");
        cB=sc.nextDouble();
        sc.close();
        H=Math.sqrt((Math.pow(cA, 2))+(Math.pow(cB, 2)));
        System.out.println("A hipotenusa é igual a "+H);

    }    
}
