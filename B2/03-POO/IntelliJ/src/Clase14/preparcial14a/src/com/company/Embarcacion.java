package com.company;

public abstract class Embarcacion {
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private double esloraMetros;
    private Capitan capitan;


    public double calcularAlquiler(){
        if (anioFabricacion > 2020){
            return precioBase + valorAdicional;
        }else{
            return precioBase;
        }
    }

    @Override
    public String toString() {
        return "Embarcacion{" +
                "precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", anioFabricacion=" + anioFabricacion +
                ", esloraMetros=" + esloraMetros +
                ", capitan=" + capitan +
                '}';
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getEsloraMetros() {
        return esloraMetros;
    }

    public void setEsloraMetros(double esloraMetros) {
        this.esloraMetros = esloraMetros;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }
}
