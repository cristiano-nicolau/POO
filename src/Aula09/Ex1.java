package Aula09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import Aula06.Pessoa;
import Aula05.Date;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> c1= new ArrayList<>();
        for(int i= 10; i<= 100; i+=10) {
            c1.add(i); }
        System.out.println("Size: "+ c1.size());
        for(int i= 0; i< c1.size(); i++) {
            System.out.println("Elemento: "+ c1.get(i));}
        ArrayList<String> c2= new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);
        System.out.println(c2.contains("Frio"));
        System.out.println(c2.contains("Calor"));
        System.out.println(c2.indexOf("Calor"));
        System.out.println(c2.lastIndexOf("Frio"));

        Set<Pessoa> c3 = new HashSet<>();
        c3.add(new Pessoa("Cristiano", 108536,new Aula05.Date(14, 8, 2003)));
        c3.add(new Pessoa("Miguel", 108317,new Aula05.Date(30, 5, 2003)));
        c3.add(new Pessoa("Rei", 106512,new Aula05.Date(27, 8, 2003)));
        c3.add(new Pessoa("Cruz", 189567,new Aula05.Date(20, 4, 2003)));
        Iterator<Pessoa> i=c3.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        Set<Date> c4 = new TreeSet<>();
        c4.add(new Date(14, 8, 2003));
        c4.add(new Date(5, 6, 2012));
        c4.add(new Date(25, 10, 1995));
        System.out.println(c4);
        Iterator<Date> u=c4.iterator();
        while (u.hasNext()){
            System.out.println(u.next());
        }
    }
}
