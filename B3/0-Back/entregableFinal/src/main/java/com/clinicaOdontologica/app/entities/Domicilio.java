package com.clinicaOdontologica.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "domicilios")
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
    @JsonIgnore
    private Paciente paciente;

}
