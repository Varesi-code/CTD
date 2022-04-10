package com.clinicaOdontologica.app.repository;

import com.clinicaOdontologica.app.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
