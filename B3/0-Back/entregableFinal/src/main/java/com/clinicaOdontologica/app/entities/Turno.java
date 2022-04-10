package com.clinicaOdontologica.app.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name="turnos")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private LocalDate fecha;

    @Column
    private LocalTime hora;
    // atributos de relacion
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_paciente", nullable = false)
    private Paciente paciente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_odontologo", nullable = false)
    private Odontologo odontologo;

}
