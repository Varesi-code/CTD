package Clase14.C14;


public class Embarcacion {
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private double esloraMetros;

    public Embarcacion(double precioBase, double valorAdicional, int anioFabricacion, double esloraMetros) {
        ;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.esloraMetros = esloraMetros;
    }

    public double calcularAlquiler() {
        if ( this.getAnioFabricacion() > 2020){
            return this.getPrecioBase() + this.getValorAdicional();
        }
        return this.getPrecioBase();

    };

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
}
