package com.company;

public class Velero extends Embarcacion{
    private int cantMastiles;

    public Velero(double precioBase, double valorAdicional, int anioFabricacion,double esloraMetros, int cantMastiles){
        super();
        setPrecioBase(precioBase);
        setValorAdicional(valorAdicional);
        setAnioFabricacion(anioFabricacion);
        setEsloraMetros(esloraMetros);
        this.cantMastiles = cantMastiles;
    }
    public boolean calcularEsGrande() {
        return cantMastiles > 4;
    }

    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }
}
