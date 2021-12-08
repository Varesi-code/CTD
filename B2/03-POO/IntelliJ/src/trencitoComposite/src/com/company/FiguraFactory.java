package com.company;

public class FiguraFactory {



    public static FiguraDibujable getFigura(String nombre, double medida1, double medida2) throws FactoryException {
        FiguraDibujable figura = null;
        if (!nombre.equals("rectangulo")||!nombre.equals("triangulo")||!nombre.equals("circulo")|| !nombre.equals("locomotora")||!nombre.equals("vagon")) {
            throw new FactoryException("Figura no reconocida. Chequee el nombre");
        }

        if (nombre.equals("rectangulo")) {
            figura = new FiguraRectangulo(nombre, medida1, medida2);
        }
        if (nombre.equals("circulo")) {
            figura = new FiguraCirculo(nombre, medida1, medida2);
        }
        if (nombre.equals("triangulo")) {
            figura = new FiguraTriangulo(nombre, medida1, medida2);
        }
        if (nombre.equals("vagon")) {
            figura = new Vagon(nombre);
            ((Vagon) figura).agregarFigura(FiguraFactory.getFigura("circulo", medida1, medida2));
            ((Vagon) figura).agregarFigura(FiguraFactory.getFigura("circulo", medida1, medida2));
            ((Vagon) figura).agregarFigura(FiguraFactory.getFigura("circulo", medida1, medida2));
            ((Vagon) figura).agregarFigura(FiguraFactory.getFigura("circulo", medida1, medida2));
            ((Vagon) figura).agregarFigura(FiguraFactory.getFigura("rectangulo", medida1, medida2));
        }
        if (nombre.equals("locomotora")){
            figura = Locomotora.getInstance();
            ((Locomotora) figura).agregarFigura(FiguraFactory.getFigura("circulo", medida1, medida2));
            ((Locomotora) figura).agregarFigura(FiguraFactory.getFigura("circulo", medida1, medida2));
            ((Locomotora) figura).agregarFigura(FiguraFactory.getFigura("circulo", medida1, medida2));
            ((Locomotora) figura).agregarFigura(FiguraFactory.getFigura("circulo", medida1, medida2));
            ((Locomotora) figura).agregarFigura(FiguraFactory.getFigura("rectangulo", medida1, medida2));

        }
        return figura;
    }}



