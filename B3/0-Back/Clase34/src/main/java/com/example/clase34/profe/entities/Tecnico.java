package com.example.clase34.profe.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name ="tecnico")
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String nombre;
    @Column
    private int edad;
    @OneToMany(mappedBy = "tecnico", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Jugador> jugadores = new HashSet<>();

    public Tecnico(){}


}
