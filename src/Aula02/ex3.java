package Aula02;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
    double tempi,tempf,M,Q;
    Scanner sc =new Scanner(System.in);
    System.out.println("Introduza a temperatura inicial: ");
    tempi=sc.nextDouble();
    System.out.println("Introduza a temperatura final: ");
    tempf=sc.nextDouble();
    System.out.println("Introduza a quantidade de agua em quilos: ");
    M=sc.nextDouble();
    Q=M*(tempf-tempi)*4184;
    sc.close();
    System.out.println("A energia necessaria para aquecer a agua é de "+Q);   
    }
}
