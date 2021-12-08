package com.company;

import java.util.List;

public class Almacen {
    private List<Producto> productos;

    public double calcularEspacioNecesario(){
        double espacio = productos.calcularEspacio();
        return espacio;
    }
}
