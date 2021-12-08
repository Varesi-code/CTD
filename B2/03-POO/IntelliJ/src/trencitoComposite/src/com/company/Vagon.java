package com.company;

import java.util.ArrayList;
import java.util.List;

public class Vagon implements FiguraDibujable{
    private String nombre;
    private List<FiguraDibujable> figuras;

    public Vagon(String nombre) {
        this.nombre = nombre;
        this.figuras = new ArrayList<FiguraDibujable>();
    }

    // agregar figuras para formar una parte. puede ser cualquiera
    public void agregarFigura(FiguraDibujable figura){
        figuras.add(figura);
    }

    @Override
    public double calcularArea() {
        double area = 0;
        for(FiguraDibujable f : figuras){
            area += f.calcularArea();
        }
        return area;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "nombre='" + nombre + '\'' +
                ", figuras=" + figuras +
                '}';
    }
}
