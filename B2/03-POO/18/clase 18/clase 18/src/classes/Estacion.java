package classes;

import java.util.Objects;

public class Estacion {
    private String nombre;
    private int numeroEstacion;
    public Boolean estacionFinal;

    public Estacion(String nombre, int numeroEstacion, Boolean estacionFinal) {
        this.nombre = nombre;
        this.numeroEstacion = numeroEstacion;
        this.estacionFinal = estacionFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEstacion() {
        return numeroEstacion;
    }

    public void setNumeroEstacion(int numeroEstacion) {
        this.numeroEstacion = numeroEstacion;
    }

    public Boolean getEstacionFinal() {
        return estacionFinal;
    }

    public void setEstacionFinal(Boolean estacionFinal) {
        this.estacionFinal = estacionFinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estacion estacion = (Estacion) o;
        return numeroEstacion == estacion.numeroEstacion &&
                Objects.equals(nombre, estacion.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numeroEstacion);
    }
}
