package com.clinicaOdontologica.clinica.service;
import com.clinicaOdontologica.clinica.dominio.Paciente;
import java.util.List;

public interface PacienteServiceInterface {
   List<Paciente> listAllPacientes();
   Paciente findEmailPaciente(String email);

   //clase 25 API
   Paciente insertPaciente (Paciente paciente);
   Paciente updatePaciente (Paciente paciente);

   void deletePaciente (int id);
   Paciente findPaciente(int id);



}
