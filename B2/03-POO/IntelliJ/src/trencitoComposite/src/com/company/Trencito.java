package com.company;

import java.util.ArrayList;
import java.util.List;

public class Trencito {
    private List<FiguraDibujable> figuras = new ArrayList<FiguraDibujable>();

    public Trencito() {
        this.figuras = new ArrayList<FiguraDibujable>();
    }

    public void agregarFigura(FiguraDibujable figura) {
        figuras.add(figura);
    }

    public double calculaArea(){
        double area = 0;
        for(FiguraDibujable figura : figuras){
            area += figura.calcularArea();
        }return area;
    }
    @Override
    public String toString() {
        return "Trencito{" +
                "figuras=" + figuras +
                '}';
    }
}
