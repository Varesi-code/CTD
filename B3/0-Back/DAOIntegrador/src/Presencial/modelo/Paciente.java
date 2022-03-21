package Presencial.modelo;
import java.time.LocalDate;

public class Paciente {
    private String nombre,apellido;
    private Domicilio domicilio;
    private LocalDate fecha_ingreso;
    private Integer dni,id;

    public Paciente(String nombre, String apellido, Domicilio domicilio, LocalDate fecha_ingreso, Integer dni, Integer id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fecha_ingreso = fecha_ingreso;
        this.dni = dni;
        this.id = id;
    }

    public Paciente(String nombre, String apellido, Domicilio domicilio, LocalDate fecha_ingreso, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fecha_ingreso = fecha_ingreso;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public LocalDate getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(LocalDate fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Paciente " +
                "nombre= " + nombre + '\'' +
                ", apellido= " + apellido + '\'' +
                ", domicilio= " + domicilio.toString() +
                ", fecha_ingreso= " + fecha_ingreso +
                ", dni= " + dni +
                ", id= " + id ;
    }
}
