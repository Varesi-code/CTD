package Figuras;

import java.util.ArrayList;
import java.util.List;

public class Dibujo {
   private List<FiguraDibujable> componentes = new ArrayList<FiguraDibujable> ();

   public void agregaFigura(FiguraDibujable f) {
      componentes.add(f);
   }

   public void dibuja(){
      for (FiguraDibujable f: componentes) {
         f.dibujar ();
         System.out.println (" - - - - ");
      }
   }
}
