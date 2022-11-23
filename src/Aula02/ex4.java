package Aula02;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        double invs,total;
        float jrf,jr;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduza o valor do investimento inicial: ");
        invs=sc.nextDouble();
        System.out.println("Introduza o valor do juro(%): ");
        jr=sc.nextFloat();
        jrf=jr/100;
        total=invs;
        sc.close();
        for (int i=0;i<3;i++){
            total=total+(total*jrf);
        }
        
        System.out.println("Com um investimento inicial de "+invs+" e com uma taxa de juro mensal de "+ jr+" ao fim de 3 meses  o valor total será  de "+ total+ "euros");

    }
    
}
