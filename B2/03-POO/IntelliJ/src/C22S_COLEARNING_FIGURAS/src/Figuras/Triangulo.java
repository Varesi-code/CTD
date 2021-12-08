package Figuras;

public class Triangulo implements FiguraDibujable{

   private String nombre;
   private int l1, l2, l3;

   public Triangulo (String nombre, int l1, int l2, int l3) {
      this.nombre = nombre;
      this.l1 = l1;
      this.l2 = l2;
      this.l3 = l3;
   }



   @Override
   public void dibujar () {
      System.out.println ("Dibujando un triangulo " + this.nombre);
   }
}
