package com.company;

import java.util.Date;

public class Paciente {
    private String nombre;
    private String apellido;
    private String historiaClinica;
    private Date fechaInternacion;
    private Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws PacienteException {   Date hoy= new Date();
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        if (fechaInternacion.before(hoy))
            this.fechaInternacion=fechaInternacion;
        if (fechaInternacion.after(hoy))
            throw new PacienteException("fecha de internacion ivalida");
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta)
    {
        if (fechaAlta.after(fechaInternacion))
            System.out.println("Ok");
        else
            System.out.println("No se puede");
    }
    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", historiaClinica='" + historiaClinica + '\'' +
                ", fechaInternacion=" + fechaInternacion +
                ", fechaAlta=" + fechaAlta +
                '}';
    }
}
