package com.clinicaOdontologica.app.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name="pacientes")
public class Paciente {

    @Id
    @SequenceGenerator (name = "paciente_sequence", sequenceName = "paciente_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "paciente_sequence")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni")
    private Integer DNI;

    @Column(name = "fecha_ingreso")
    private String fechaIngreso;

    @Column(name="email")
    private String email;

    // atributos de relaciones

    //para que afecte a la tabla de domicilios(cascade)
    @OneToOne(cascade = CascadeType.REMOVE)
    //se crea la clave foranea. puedo elegir el nombre
    @JoinColumn(name = "domicilio_id" , referencedColumnName = "id")
    private Domicilio domicilio;

    @OneToMany( mappedBy = "paciente", fetch = FetchType.LAZY)
    //para no generar un bucle infinito
    @JsonIgnore
    private Set<Turno> turnos = new HashSet<>();
}
