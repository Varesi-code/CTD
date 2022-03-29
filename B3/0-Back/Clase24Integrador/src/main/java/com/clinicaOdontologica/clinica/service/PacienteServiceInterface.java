package com.clinicaOdontologica.clinica.service;
import com.clinicaOdontologica.clinica.dominio.Paciente;
import java.util.List;

public interface PacienteServiceInterface {
   List<Paciente> listAll();
   Paciente buscarPacienteXEmail(String email);

   //clase 25 API
   Paciente guardar (Paciente paciente);
   Paciente actualizar (Paciente paciente);

   void eliminar (int id);
   Paciente buscar(int id);


}
