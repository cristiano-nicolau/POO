package Aula04;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        String s1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduza uma string: ");
        s1=sc.nextLine();
        sc.close();
        System.out.println("A string contem "+ countDigits(s1)+" digitos");
        System.out.println("A string contem "+ countSpaces(s1)+" spaces");
        System.out.println("A string ésta em minusculas: "+ AllLower(s1));
        System.out.println("A string é um palindromo: "+ palindromo(s1));
       // System.out.println("A string so com um espaço: "+ OneSpce(s1));

    }
    public static int countDigits (String s1) {
        int count=0;
        for (int i=0; i<s1.length();i++){
            if (Character.isDigit(s1.charAt(i))){
                count+=1;
            }
        }
        return count;
    }
    public static int countSpaces (String s1) {
        int count=0;
        for (int i=0; i<s1.length();i++){
            if (Character.isSpaceChar(s1.charAt(i))){
                count+=1;
            }
        }
        return count;
    }
    public static boolean AllLower (String s1) {
        String s2=s1.toLowerCase();
        if (s1==s2){
            return true;
        }
        return false;
    }
    public static boolean palindromo (String s1) {
        String palindromo = "";		
        for(int i = s1.length() -1; i >= 0; i--){
            palindromo += s1.charAt(i);
        }
        palindromo=palindromo.replace(" ","").toLowerCase();
        s1=s1.replace(" ","").toLowerCase();
        if (palindromo.equals(s1)){
            return true;
        }
        return false;
    }
    //public static String OneSpce (String s1) {
      
    //  s1=s1.replace("       ", " ");
      //  return s1;
    //}

}
