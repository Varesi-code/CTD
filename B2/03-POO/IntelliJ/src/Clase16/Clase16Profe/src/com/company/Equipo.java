package com.company;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List <Jugador>jugadores = new ArrayList<Jugador>();

    public void addJugador(Jugador elJugador){
        jugadores.add(elJugador);
    }

    public void mostrarJugadoresTitulares(){
        jugadores.sort(null);
        for (Jugador j: jugadores ) {
            if (j.esTitular())
                System.out.println(j);
        }
    }

    public int getCantidadJugadoresLesionados(){
        int cuantos = 0;
        for (Jugador j: jugadores){
            if (j.estaLesionado() && j.esTitular())
                cuantos++;
        }
        return cuantos;
    }
}
