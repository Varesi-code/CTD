package Figuras;

import java.util.ArrayList;
import java.util.List;

public class FiguraCompleja  implements FiguraDibujable{


   private String nombre;
   private List<FiguraDibujable> figuras;

   public FiguraCompleja (String nombre) {
      this.nombre = nombre;
      this.figuras = new ArrayList<FiguraDibujable> ();
   }

   //agregamos figuras a la compleja, puede ser cualquier tipo de figura
   public void agregarFigura(FiguraDibujable figura) {
      figuras.add (figura);
   }


   @Override
   public void dibujar () {
      for (FiguraDibujable figura : figuras) {
         figura.dibujar (); //porque si es una figura dibujable se sabe dibujar
      }
   }
}
