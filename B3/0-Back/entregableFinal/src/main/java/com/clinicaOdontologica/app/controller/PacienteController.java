package com.clinicaOdontologica.app.controller;

import com.clinicaOdontologica.app.entities.Paciente;
import com.clinicaOdontologica.app.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/{id}")
    public ResponseEntity<String> getPaciente(@PathVariable("id") Long id) {
        ResponseEntity<String> response = null;
        if (pacienteService.buscar(id) != null) {
            response = ResponseEntity.ok("Paciente encontrado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).body("Paciente no encontrado");
        }
        return response;
    }

    @PostMapping()
    public ResponseEntity<String> crearPaciente(@RequestBody Paciente paciente) {
        ResponseEntity<String> response = null;
        if (pacienteService.guardar(paciente) != null) {
            response = ResponseEntity.ok("Paciente creado");
        } else {
            response = ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Paciente no creado");
        }
        return response;
    }

    @PutMapping
    public ResponseEntity<String> actualizarPaciente(@RequestBody Paciente paciente) {
        ResponseEntity<String> response = null;
        if (pacienteService.actualiza(paciente) != null) {
            response = ResponseEntity.ok("Paciente actualizado");
        } else {
            response = ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Paciente no actualizado");
        }
        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarPaciente(@PathVariable Long id) {
        ResponseEntity<String> response =null;

        if (pacienteService.buscar(id) != null) {
            pacienteService.eliminar(id);
            response = ResponseEntity.ok("Paciente eliminado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).body("Paciente no encontrado");
        }
        return response;
    }
}
