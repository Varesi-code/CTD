package com.company;

public class Main {

    public static void main(String[] args) {

        Trencito trencito = new Trencito();

        try {
            trencito.agregarFigura(FiguraFactory.getFigura("rectangulo", 5, 7));
            trencito.agregarFigura(FiguraFactory.getFigura("vagon", 2, 4));
            trencito.agregarFigura(FiguraFactory.getFigura("locomotora", 7, 7));
            trencito.agregarFigura(FiguraFactory.getFigura("vagon", 3, 5));
        }
        catch (FactoryException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(trencito.calculaArea());

    }
}
