package com.company;

import java.util.ArrayList;
import java.util.List;

public class Locomotora implements FiguraDibujable {
    private static Locomotora instance = new Locomotora();
    private List<FiguraDibujable> figuras;

    private Locomotora(){
        this.figuras = new ArrayList<FiguraDibujable>();
    }

    public static Locomotora getInstance(){
        if(instance == null){
            instance = new Locomotora();
        }
        return instance;
    }

    public void agregarFigura(FiguraDibujable figura){
        this.figuras.add(figura);
    }
    @Override
    public double calcularArea() {
        double area = 0.0;
        for(FiguraDibujable figura : figuras){
            area += figura.calcularArea();
        }
        return area;
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "figuras=" + figuras +
                '}';
    }
}
