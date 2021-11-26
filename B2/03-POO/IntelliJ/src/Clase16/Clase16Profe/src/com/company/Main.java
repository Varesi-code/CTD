package com.company;

import java.util.logging.SocketHandler;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Equipo eq= new Equipo();

        Jugador j1 = new Jugador(4,"Kuglietti",false, true);
        eq.addJugador(j1);
        j1 = new Jugador(7,"Lopez",true, true);
        eq.addJugador(j1);
        j1 = new Jugador(2,"Sampiter",false, false);
        eq.addJugador(j1);
        j1 = new Jugador(17,"Mulito",true, true);
        eq.addJugador(j1);
        j1 = new Jugador(12,"Galtorin",true, false);
        eq.addJugador(j1);
        j1 = new Jugador(5,"Pepe",false, true);
        eq.addJugador(j1);
        eq.addJugador(new Jugador(9,"Directo",false, true));

        eq.mostrarJugadoresTitulares();
        System.out.println(eq.getCantidadJugadoresLesionados());



    }
}
