package com.dh.integradora.dominio;

import java.time.LocalDate;

public class Paciente {
    private int id;
    private String apellido;
    private String nombre;
    private String email;
    private int dni;
    private LocalDate fechaIngreso;
    private Domicilio domicilio;

    public Paciente(){

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

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}
