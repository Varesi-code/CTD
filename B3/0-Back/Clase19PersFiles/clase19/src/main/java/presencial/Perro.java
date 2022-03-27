package presencial;

import java.io.Serializable;

public class Perro implements Serializable {
    private int edad;
    private String nombre;

    public Perro(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString(){
        return "Can: "+nombre+" - Edad: "+edad;
    }
}
