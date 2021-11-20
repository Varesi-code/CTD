package com.company;

//https://drive.google.com/file/d/1YWT8p5COnq9Ad0bgsoHsumG7i_4iz0Gb/view

public class Main {
   public static void main(String[] args){
      Final a = new Final();
      Final b = new Final();

      a.setNotaOral(5);
      a.setNota(6);

      b.setNotaOral(8);
      b.setNota(9);

      System.out.println(a.compareTo(b));

   }
}
