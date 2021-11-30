package classes;

import exceptions.EstacionException;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Reserva> reservas = new ArrayList<>();
    private Trayecto estacionesPosibles = new Trayecto();

    public Boolean existeEstacion(Estacion estacion) throws EstacionException {
        if(!this.estacionesPosibles.estacionPosible(estacion)) {
            throw new EstacionException("La estacion: " + estacion.getNombre() + " no existe");
        }
        return true;
    }

    public double recaudacionTotal() {
        double recaudacion = 0;
        for(Reserva reserva : this.reservas) {
            recaudacion += reserva.calcularValor();
        }
        return recaudacion;
    }

    public int cantVecesRecorrida(Estacion estacion) throws EstacionException {
        this.existeEstacion(estacion);
        int cantPersonas = 0;
        for(Reserva reserva : this.reservas) {
            if(reserva.visitaraEstacion(estacion)) {
                cantPersonas += reserva.getCantidadPersonas();
            }
        }
        return cantPersonas;
    }
}
