package Figuras;

public class Main {

    public static void main(String[] args) {

        Dibujo d = new Dibujo ();

        d.agregaFigura (FiguraFactory.getFigura ("triangulo grande"));
        d.agregaFigura (FiguraFactory.getFigura ("cuadrado"));
        d.agregaFigura (FiguraFactory.getFigura ("casita"));


        d.dibuja ();
    }
}
