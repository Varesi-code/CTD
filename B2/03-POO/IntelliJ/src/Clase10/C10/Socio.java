package Clase10.C10;

public class Socio {
    private String numeroSocio;
    private String nombre;
    private double cuotaMensual;
    private String actividad;

    public Socio ( String numero, String nombre, double cuota, String actividad ) {
        numeroSocio = numero;
        this.nombre = nombre;
        this.cuotaMensual = cuota;
        this.actividad = actividad;
    }
    public double costoMensual() {
        return this.cuotaMensual;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "numeroSocio='" + numeroSocio + '\'' +
                ", nombre='" + nombre + '\'' +
                ", actividad='" + actividad + '\'' +
                '}';
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
}
