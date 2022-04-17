package com.clinicaOdontologica.app.repository;

import com.clinicaOdontologica.app.entities.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdontologoRepository extends JpaRepository<Odontologo, Long> {
}
