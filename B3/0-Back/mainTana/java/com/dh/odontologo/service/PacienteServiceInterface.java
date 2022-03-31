package com.dh.odontologo.service;

import com.dh.odontologo.domain.Paciente;

import java.util.List;

public interface PacienteServiceInterface {
   List<Paciente> listarPacientes();
   Paciente buscarPacienteXEmail(String email);

   //clase 25 API
   Paciente guardar (Paciente paciente);
   Paciente actualizar (Paciente paciente);
}
