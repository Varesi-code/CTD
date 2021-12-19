package com.company;

public class Simple implements Servicio{
    private String nombre;
    private String descripcion;
    private double precio;

    @Override
    public double getPrecio() {

        return this.precio;
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

    public void setPrecio(double precio) {
        if(nombre.equals("colocacion")){
            precio = precio * 1.1;
        }
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Simple{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
