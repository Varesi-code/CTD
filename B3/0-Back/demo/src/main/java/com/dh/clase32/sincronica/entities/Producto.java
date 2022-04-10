package com.dh.clase32.sincronica.entities;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String nombre;
    @Column
    private int cantidad;
    @Column
    private String descripcion;
}
