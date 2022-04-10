package com.example.clase34.profe.entities;


import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="jugador")
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String clubFavorito;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tecnico_id")
    private Tecnico tecnico;

    public Jugador(){}

}
