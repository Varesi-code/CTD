package com.dh.odontologo.controller;

import com.dh.odontologo.domain.Paciente;
import com.dh.odontologo.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/*Paciente service es el responsable de hacer las cosas en ésta parte el modelo*/
//@Controller
@RestController
@RequestMapping("/pacientes")
public class PacienteController {

   private final PacienteService pacienteService;

   //constructor
   @Autowired
   public PacienteController (PacienteService pacienteService) {
      this.pacienteService = pacienteService;
   }

   @GetMapping("/index")
   public String traerPaciente(Model model, @RequestParam ("email") String email){
      //el controlador se lo pasa al service y el service lo pasa al DAO
      Paciente paciente = pacienteService.buscarPacienteXEmail (email);
      model.addAttribute ("nombre", paciente.getNombre ());
      model.addAttribute ("apellido", paciente.getApellido ());
      return "index";
   }

   //clase 25 58'
   @PostMapping
   public Paciente registrarPaciente(@RequestBody Paciente paciente){
      return pacienteService.guardar (paciente);
   }
}
