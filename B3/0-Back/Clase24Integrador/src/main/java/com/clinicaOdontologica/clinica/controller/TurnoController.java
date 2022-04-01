package com.clinicaOdontologica.clinica.controller;

import com.clinicaOdontologica.clinica.dao.OdontologoDaoH2;
import com.clinicaOdontologica.clinica.dao.PacienteDAOH2;
import com.clinicaOdontologica.clinica.dao.TurnoDAOLista;
import com.clinicaOdontologica.clinica.dominio.Odontologo;
import com.clinicaOdontologica.clinica.dominio.Paciente;
import com.clinicaOdontologica.clinica.dominio.Turno;
import com.clinicaOdontologica.clinica.service.OdontologoService;
import com.clinicaOdontologica.clinica.service.PacienteService;
import com.clinicaOdontologica.clinica.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    @Autowired
    private PacienteService pacienteService;
    @Autowired
    private OdontologoService odontologoService;
    @Autowired
    private TurnoService turnoService;

    @GetMapping
    public ResponseEntity<List<Turno>> listarTurnos() {
        return ResponseEntity.ok(turnoService.listarTurnos());
    }

    @PostMapping
    public ResponseEntity<Turno> crearTurno(@RequestBody Turno turno) {
        ResponseEntity<Turno> respuesta;
        //preguntar si el turno ya existe y el odontologo tb (correctos)
        Paciente pacienteFind = pacienteService.findPaciente(turno.getPaciente().getId());
        Odontologo odontologoFind = odontologoService.findOdontologo((turno.getOdontologo().getMatricula()));

        if (pacienteFind != null && odontologoFind != null) {
            respuesta = ResponseEntity.ok(turnoService.crearTurno(turno));
        } else {
            respuesta = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return respuesta;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTurno(@PathVariable int id) {
        ResponseEntity<String> response;
        if (turnoService.buscarTurno(id) != null) {
            turnoService.eliminarTurno(id);
            response = ResponseEntity.status(HttpStatus.OK).body("Turno con id " + id + " eliminado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).body("Turno con id " + id + " no encontrado");
            return response;
        }
        return response;
    }
    @GetMapping
    public ResponseEntity<Turno> buscarTurno(@PathVariable int id) {
        ResponseEntity<Turno> response;
        Turno turno = turnoService.buscarTurno(id);
        if (turno != null) {
            response = ResponseEntity.ok(turno);
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return response;
    }

    @PutMapping
    public ResponseEntity<Turno> actualizarTurno(@RequestBody Turno turno) {
        ResponseEntity<Turno> response;
        Turno turnoFind = turnoService.buscarTurno(turno.getId());
        if (turnoFind != null) {
            response = ResponseEntity.ok(turnoService.modificarTurno(turno));
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return response;
    }
}