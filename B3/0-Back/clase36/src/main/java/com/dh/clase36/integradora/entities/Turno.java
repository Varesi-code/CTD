package com.dh.clase36.integradora.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "turnos")
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="paciente_id",nullable = false)
    private Paciente paciente;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="odontologo_id",nullable = false)
    private Odontologo odontologo;
    @Column
    private LocalDate fecha;

    public Turno(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
