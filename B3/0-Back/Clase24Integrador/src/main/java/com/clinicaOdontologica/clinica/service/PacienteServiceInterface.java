package com.clinicaOdontologica.clinica.service;


import com.clinicaOdontologica.clinica.dominio.Paciente;

import java.util.List;

public interface PacienteServiceInterface {
    List<Paciente> listAll();
    Paciente buscarXEmail(String email);
    //clase25
    Paciente guardar(Paciente paciente);
    Paciente actualizar(Paciente paciente);

}
