package com.dh.clase23.integral.service;

import com.dh.clase23.integral.dominio.Paciente;

import java.util.List;

public interface PacienteServiceInterface {
    List<Paciente> listarPacientes();
    Paciente buscarXEmail(String email);
}
