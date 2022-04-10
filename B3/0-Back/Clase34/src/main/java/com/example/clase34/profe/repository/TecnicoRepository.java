package com.example.clase34.profe.repository;

import com.example.clase34.profe.entities.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TecnicoRepository extends JpaRepository<Tecnico,Long> {
    //1 para crear un tecnico usas .save(t)

    @Query("select t from Tecnico t where t.nombre = ?1")
    Optional<Tecnico> buscarTecnicoPorNombre(String nombre);
}
