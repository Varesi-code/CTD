package com.clase34.mesas.repository;


import com.clase34.mesas.entities.Veterinaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface VeterinariaRepository extends JpaRepository<Veterinaria, Long> {
    //crear veterinaria
    @Query("insert into veterinaria (nombre, direccion, telefono) values (:nombre, :direccion, :telefono)")


}
