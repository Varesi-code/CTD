package com.clase34.mesas.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "veterinaria")
public class Veterinaria {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "veterinaria")
    private String nombre;
    @Column
    private int costo;
    @OneToMany(mappedBy="veterinaria",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Mascota> mascotas = new HashSet<>();

    public Veterinaria() {
    }
}
