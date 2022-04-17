package com.clinicaOdontologica.app.repository;

import com.clinicaOdontologica.app.entities.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long> {
}
