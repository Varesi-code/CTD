package com.company;

public class Service {
    private String articulo;
    private double costo;
    private String direccion;

    public void asignarPresupuesto(double costo){
        this.costo = costo;
    }

    public void cambioDireccion(String direccion){
        this.direccion = direccion;
    }

    public void asignarRepuestos(double repuesto){
        this.costo += repuesto;
    }
    public void pasarSigPaso(){
        this.costo += 10;
    }


}
