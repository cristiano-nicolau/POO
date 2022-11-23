package Aula04;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        String s1,s2;
        s2="";
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduza uma string: ");
        s1=sc.nextLine();
        sc.close();
        for (int i=0; i<s1.length();i++){
            if (Character.isUpperCase(s1.charAt(i))){
                s2+=s1.charAt(i);
            }
        }
        System.out.println("Acronimo: "+s2);
    }
}
