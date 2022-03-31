package com.clinicaOdontologica.clinica.dominio;

import java.time.LocalDate;

public class Paciente {
    private int id;
    private String apellido;
    private String nombre;
    private String email;
    private int dni;
    private LocalDate fechaIngreso;
    private Domicilio domicilio;

    public Paciente() {
    }

    public Paciente(int id, String apellido, String nombre, String email, int dni, LocalDate fechaIngreso, Domicilio domicilio) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.domicilio = domicilio;
    }

    public Paciente(String apellido, String nombre, String email, int dni, LocalDate fechaIngreso, Domicilio domicilio) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.domicilio = domicilio;
    }

    public int getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getDni() {
        return dni;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setId(int anInt) {
        id = anInt;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
