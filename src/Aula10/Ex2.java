package Aula10;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Random;
import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        Map<String,ArrayList<String>> conjunto  = new TreeMap<>();
        conjunto.put("Leite",new ArrayList<>());
        conjunto.get("Leite").add("Palido");
        conjunto.get("Leite").add("Decorado");
        conjunto.put("Porshe",new ArrayList<>());
        conjunto.get("Porshe").add("Panamera");
        conjunto.get("Porshe").add("Taycan");
        conjunto.get("Porshe").add("Panamera GT");
        conjunto.get("Porshe").add("Cayman");
        conjunto.put("Ferrari",new ArrayList<>());
        conjunto.get("Ferrari").add("812");
        conjunto.get("Ferrari").add("458");
        conjunto.get("Ferrari").add("288");
        conjunto.get("Ferrari").add("f40");
        conjunto.get("Ferrari").add("f8");
        conjunto.get("Ferrari").add("sf90");
        conjunto.get("Ferrari").add("Roma");

        System.out.println(conjunto.entrySet());
		System.out.println(conjunto.keySet());
		System.out.println(conjunto.values());

        Scanner sc=new Scanner(System.in);
        System.out.println("Insira um termo:");
        String str=sc.nextLine();
        sc.close();

        int a = conjunto.get(str).size();

        Random rand = new Random();
        int maxNumber = a;
        int randomNumber = rand.nextInt(maxNumber) ;

        System.out.println(conjunto.get(str).get(randomNumber));
    }
}
