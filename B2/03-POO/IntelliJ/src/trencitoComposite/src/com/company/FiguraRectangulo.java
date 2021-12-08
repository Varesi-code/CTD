package com.company;

public class FiguraRectangulo implements FiguraDibujable{
    private String nombre;
    private double lado1;
    private double lado2;

    public FiguraRectangulo(String nombre, double lado1, double lado2){
        this.nombre = nombre;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return this.lado1 * this.lado2;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " Lado1: " + this.lado1 + " Lado2: " + this.lado2 + " Area: " + this.calcularArea();
    }
}
