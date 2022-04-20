package com.clinicaOdontologica.app.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="turnos")
public class Turno {

    @Id
    @SequenceGenerator (name = "turno_sequence", sequenceName = "turno_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "turno_sequence")
    private Long id;

    @Column
    private LocalDate fecha;

    @Column
    private LocalTime hora;

    // atributos de relacion
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="paciente_id", nullable = false)
    private Paciente paciente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="odontologo_id", nullable = false)
    private Odontologo odontologo;


}
