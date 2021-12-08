package com.company;

public class FiguraTriangulo implements FiguraDibujable{
    private String nombre;
    private double base;
    private double altura;

    public FiguraTriangulo(String nombre, double lado1, double lado2){
        this.nombre = nombre;
        this.base = lado1;
        this.altura = lado2;
    }

    @Override
    public double calcularArea(){
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return  "FiguraTriangulo{" + nombre + "area=" + calcularArea() + "base=" + base + ", altura=" + altura + "}";
    }
}
