package presencial;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private String DNI;
    private String nombreVacuna;
    private Date fechaAsignada;

    public Persona(String nombre, String apellido, String DNI, String nombreVacuna, Date fechaAsignada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.nombreVacuna = nombreVacuna;
        this.fechaAsignada = fechaAsignada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public Date getFechaAsignada() {
        return fechaAsignada;
    }
}
