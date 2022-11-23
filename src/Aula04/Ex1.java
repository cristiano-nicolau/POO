package Aula04;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String s1,s2,s4,s5;
        char s3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduza uma string: ");
        s1=sc.nextLine();
        s2=s1.toLowerCase();
        s3=s1.charAt(s1.length()-1);
        s4=s1.substring(0, 3);
        s5=s1.toUpperCase();
        System.out.println("A string convertida em minuscualas é igual a "+s2);
        System.out.println("A string convertida em maiusculas é igual a "+s5);
        System.out.println("O ultimo caracter da string é "+s3);
        System.out.println("Os 3 primeiros caracters sao "+s4);

        sc.close();
    }
    
}
