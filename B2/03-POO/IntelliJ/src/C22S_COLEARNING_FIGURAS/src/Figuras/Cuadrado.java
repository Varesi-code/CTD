package Figuras;

public class Cuadrado  implements FiguraDibujable {

   private String nommbre;
   private int lado;

   public Cuadrado (String nommbre, int lado) {
      this.nommbre = nommbre;
      this.lado = lado;
   }

   @Override
   public void dibujar () {
      System.out.println ("Dibujar un cuadrado");
   }
}
