package Aula10;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<String,String> conjunto  = new HashMap<>();

        conjunto.put("Branco", " Qual a cor da neve");
        conjunto.put("Cão", " Animal");
        conjunto.put("BMW", " Qual a melhor marca");
        conjunto.put("Python", " Qual melhor linguagem prog");
        conjunto.put("Vermelho", " Qual cor do sangue");
        conjunto.put("Bue", " Muito");
        conjunto.remove("Bue");
        conjunto.replace("Python", " Qual melhor linguagem prog", "Linguagem de programaçao");

        System.out.println(conjunto.entrySet());
		System.out.println(conjunto.keySet());
		System.out.println(conjunto.values());
        System.out.println(conjunto.size());

    }    
}
