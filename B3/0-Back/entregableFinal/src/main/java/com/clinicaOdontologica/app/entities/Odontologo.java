package com.clinicaOdontologica.app.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "odontologos")
public class Odontologo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private int matricula;
    @Column
    private String nombre;
    @Column
    private String apellido;

    // atributos de relaciones
    @OneToMany(mappedBy = "odontologo", fetch = FetchType.LAZY)
    // @JsonIgnore
    private Set<Turno> turnos=new HashSet<>();

}
