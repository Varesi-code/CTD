package com.company;

public class FiguraCirculo implements FiguraDibujable{
    private String name;
    private double radio;
    private double diametro;

    public FiguraCirculo(String name, double radio, double diametro) {
        this.name = name;
        this.radio = radio;
        this.diametro = diametro;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString(){
        return "FiguraCirculo{" + "name=" + name + ", radio=" + radio + ", diametro=" + diametro + '}';
    }
}
