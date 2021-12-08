package Figuras;

public class FiguraFactory {

   public static FiguraDibujable getFigura(String cual) {
      FiguraDibujable figura = null;
      if (cual.equals ("triangulo chico")){
         figura = new Triangulo("Triangulo chico",5, 5, 5);
      }

      if (cual.equals ("triangulo grande")){
         figura = new Triangulo("Triangulo Grande",50, 50, 50);
      }

      if (cual.equals ("cuadrado")){
         figura = new Cuadrado("Cuadrado",50);
      }

      if (cual.equals ("casita")){
         figura = new FiguraCompleja("casita");
         ((FiguraCompleja)figura).agregarFigura (FiguraFactory.getFigura ("triangulo chico"));
         ((FiguraCompleja)figura).agregarFigura (FiguraFactory.getFigura ("cuadrado"));
      }

      return figura;

   }
}
