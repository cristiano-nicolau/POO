package Aula10;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex3 {
    public static void main(String[] args) {
        String str="Hello World";
        char[] chr=str.replaceAll("//s+", "").toCharArray();
        Map<Character,TreeSet<Integer>> map= new TreeMap<>();
        for (int i=0; i<chr.length; i++){
            Character ltr=chr[i];
            if(map.containsKey(ltr)){
                map.get(ltr).add(i);
            }
            else{
                TreeSet<Integer> tree=new TreeSet<>();
                tree.add(i);
                map.put(ltr,tree);
            
            }
        }
        System.out.println(map.entrySet());
    }
}
