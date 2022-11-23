package Aula05;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
       
        int opt;
        Date data = null; 
        int dia;
        int mes;
        int ano;

        Scanner sc= new Scanner(System.in);

        do{
            System.out.println();
            System.out.println("1 - Criar nova data");
            System.out.println("2 - Mostrar data atual");
            System.out.println("3 - Incrementar data");
            System.out.println("4 - Decrementar data");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.print("Operação: ");
            opt=sc.nextInt();

            switch(opt){
                case 0:
                    System.out.println("Encerrando...");
                    break;
                case 1:
                    System.out.print("Insira um dia: ");
                    dia = sc.nextInt();
                    System.out.print("Insira um mês: ");
                    mes = sc.nextInt();
                    System.out.print("Insira um ano: ");
                    ano = sc.nextInt();          
                    data = new Date(dia, mes, ano); 
                    break;
                case 2:
                    System.out.println("Data: "+ data);
                    break;
                case 3:
                    data.increment();
                    break;
                case 4:
                    data.decrement();
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }
        } while(opt!=0);

        sc.close();
    }
}

