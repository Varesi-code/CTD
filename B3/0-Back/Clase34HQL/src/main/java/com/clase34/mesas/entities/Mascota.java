package com.clase34.mesas.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String nombre;
    @Column
    public String tipo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "veterinaria_id")
    private Veterinaria veterinaria;

    public Mascota() {
    }
}
