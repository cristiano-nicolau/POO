package Aula02;

import java.util.Scanner;

public class ex2 {
    public static  void main(String[] args){
        double tempC,tempF;
        Scanner sc= new Scanner(System.in);
        System.out.println("Temperatura em graus Celsius:");
        tempC=sc.nextDouble();
        sc.close();
        tempF=(1.8*tempC)+32;
        System.out.println("A temperatura "+ tempC+" em graus Celsius, corresponde a "+ tempF+" em graus Fahrenheit");
    }
}
