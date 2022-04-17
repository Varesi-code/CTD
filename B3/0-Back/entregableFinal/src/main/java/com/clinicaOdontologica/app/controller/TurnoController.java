package com.clinicaOdontologica.app.controller;

import com.clinicaOdontologica.app.entities.Odontologo;
import com.clinicaOdontologica.app.entities.Paciente;
import com.clinicaOdontologica.app.entities.Turno;
import com.clinicaOdontologica.app.exceptions.ResourceNotFoundException;
import com.clinicaOdontologica.app.service.OdontologoService;
import com.clinicaOdontologica.app.service.PacienteService;
import com.clinicaOdontologica.app.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


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
    public ResponseEntity<List<Turno>> listarTurnos(){
        return ResponseEntity.ok(turnoService.listarTurno());
    }
    @PostMapping
    public ResponseEntity<Turno> registrarTurno(@RequestBody Turno turno){
        ResponseEntity<Turno> respuesta;
        //preguntar si es un paciente correcto y un odontologo correcto
        Optional<Paciente> pacienteBus= pacienteService.buscar(turno.getPaciente().getId());
        Optional<Odontologo> odontologoBus=odontologoService.buscar(turno.getOdontologo().getId());

        if (pacienteBus.isPresent() && odontologoBus.isPresent()){
            respuesta= ResponseEntity.ok(turnoService.registrarTurno(turno));
        }
        else{
            respuesta=ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return respuesta;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id) throws ResourceNotFoundException {
        turnoService.eliminar(id);
        return ResponseEntity.status(HttpStatus.OK).body("Turno con id="+id+" eliminado");

    }

    @PutMapping ResponseEntity<Turno> actualizarTurno(@RequestBody Turno turno){
        Turno turnoActualizado=turnoService.actualizar(turno);
        if (turnoActualizado!=null){
            return ResponseEntity.ok(turnoActualizado);
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
