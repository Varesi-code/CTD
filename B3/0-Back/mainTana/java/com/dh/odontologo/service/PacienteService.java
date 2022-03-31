package com.dh.odontologo.service;

import com.dh.odontologo.dao.IDao;
import com.dh.odontologo.domain.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacienteService implements PacienteServiceInterface{

   //usamos un IDAO para la persistencia
   private IDao<Paciente> pacienteIDao;

   //creamos el setter para el IDao
   public PacienteService(IDao<Paciente> pacienteIDao){
      this.pacienteIDao = pacienteIDao;
   }

   @Override
   public List<Paciente> listarPacientes () {
      return pacienteIDao.listarElementos ();
   }

   @Override
   public Paciente buscarPacienteXEmail (String email) {
      return pacienteIDao.buscarEmail (email);
   }

   //Clase 25 API
   @Override
   public Paciente guardar (Paciente paciente) {
      return pacienteIDao.guardar (paciente);
   }

   @Override
   public Paciente actualizar (Paciente paciente) {
      return null;
   }
}
