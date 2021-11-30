package classes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class Trayecto {
    //El array ya se inicializa con estos valores (es lo mismo que crear el array vacio y despues hacer varios .add())
    private LinkedList<Estacion> estaciones = new LinkedList<> (Arrays.asList(
        new Estacion("Buenos Aires", 0, false),
        new Estacion("Lujan", 1, false),
        new Estacion("Mercedes", 2, false),
        new Estacion("Suipacha", 3, false),
        new Estacion("Chivilcoy", 4, false),
        new Estacion("Alberti", 5, false),
        new Estacion("Bragado", 6, true)
    ));

    //verifica que la estacion exista
    public Boolean estacionPosible(Estacion estacion) {
        return this.estaciones.contains(estacion);
    }

}
