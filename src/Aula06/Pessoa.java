package Aula06;

import Aula05.Date;

public class Pessoa {
   private String nome;
   private int cc;
   private Date dataNasc;
   
   public Pessoa(String nome, int cc, Date dataNasc) {
       this.nome = nome;
       this.cc = cc;
       this.dataNasc = dataNasc;
   }

   public String getNome() {
       return nome;
   }

   public int getCc() {
       return cc;
   }

   public Date getDataNasc() {
       return dataNasc;
   }

   @Override
   public String toString() {
       return nome + ", CC: " + cc + ", Data de Nascimento: " + dataNasc;
   }
}