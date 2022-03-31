package com.clinicaOdontologica.clinica.dominio;

import java.time.LocalDate;

public class Turno {
    private int id;
    private Odontologo odontologo;
    private Paciente paciente;
    private LocalDate fecha;

    public Turno(int id, Odontologo odontologo, Paciente paciente, LocalDate fecha) {
        this.id = id;
        this.odontologo = odontologo;
        this.paciente = paciente;
        this.fecha = fecha;
    }

    public Turno(Odontologo odontologo, Paciente paciente, LocalDate fecha) {
        this.odontologo = odontologo;
        this.paciente = paciente;
        this.fecha = fecha;
    }

    public Turno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
