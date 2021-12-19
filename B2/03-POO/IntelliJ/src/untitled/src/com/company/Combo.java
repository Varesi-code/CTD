package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Servicio{
    private String nombre;
    private String descripcion;
    private double descuento;
    private List<Servicio> servicios = new ArrayList<Servicio>();

    @Override
    public double getPrecio() {
        double precio = 0;
        for (Servicio servicio : servicios) {
            precio += servicio.getPrecio();
        }
        return precio * (100-descuento)/100;
    }

    public void agregaServicio(Servicio servicio){
        servicios.add(servicio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Combo{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", descuento=" + descuento +
                '}';
    }
}
