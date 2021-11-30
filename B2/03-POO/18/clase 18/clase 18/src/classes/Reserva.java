package classes;

import java.util.Objects;

public class Reserva {
    private String codigo;
    private Estacion estacionInicio;
    private Estacion estacionFin;
    private int cantidadPersonas;

    public double calcularValor() {
        double precio = this.cantidadPersonas * 50;
        //si el recorrido es de punta a punta
        if(this.estacionInicio.getNumeroEstacion() == 0 && this.estacionFin.getEstacionFinal()) {
            precio -= precio * 0.2;
        }
        return precio;
    }

    //devuelve true si la estacion esta entre la estacion inicial y la final
    public Boolean visitaraEstacion(Estacion estacion) {
        return estacion.getNumeroEstacion() >= this.estacionInicio.getNumeroEstacion() && estacion.getNumeroEstacion() <= this.estacionFin.getNumeroEstacion();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return cantidadPersonas == reserva.cantidadPersonas &&
                Objects.equals(codigo, reserva.codigo) &&
                Objects.equals(estacionInicio, reserva.estacionInicio) &&
                Objects.equals(estacionFin, reserva.estacionFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, estacionInicio, estacionFin, cantidadPersonas);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Estacion getEstacionInicio() {
        return estacionInicio;
    }

    public void setEstacionInicio(Estacion estacionInicio) {
        this.estacionInicio = estacionInicio;
    }

    public Estacion getEstacionFin() {
        return estacionFin;
    }

    public void setEstacionFin(Estacion estacionFin) {
        this.estacionFin = estacionFin;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
}
