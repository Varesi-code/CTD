import java.io.Serializable;

public class Empleado implements Serializable {
    private String nombre;
    private String apellido;
    private int legajo;
    private double sueldo;

    public Empleado(String nombre, String apellido, int legajo, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString(){
        return nombre+";"+apellido+";"+legajo+";"+(int)sueldo;
    }
}
