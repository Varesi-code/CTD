package com.clinicaOdontologica.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "domicilios")
@Getter
@Setter
@NoArgsConstructor
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String calle;

    @Column
    private Integer numero;

    @Column
    private String localidad;

    @Column
    private String provincia;

    //Relacion con la clase persona, la foreign key(@joincolumn) esta en persona y no en domicilio
    //donde se mapea en la base de datos la relacion
    //voy a poder conocer al paciente a traves del domicilio
    @OneToOne(mappedBy = "domicilio")
    //@JsonIgnore
    private Paciente paciente;

}
