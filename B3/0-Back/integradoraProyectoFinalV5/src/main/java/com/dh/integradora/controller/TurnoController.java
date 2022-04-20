package com.dh.integradora.controller;

import com.dh.integradora.Entities.Odontologo;
import com.dh.integradora.Entities.Paciente;
import com.dh.integradora.Entities.Turno;
import com.dh.integradora.service.OdontologoService;
import com.dh.integradora.service.PacienteService;
import com.dh.integradora.service.TurnoService;
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
    public ResponseEntity<List<Turno>> listarTurnos(){
        return ResponseEntity.ok(turnoService.listarTurno());
    }
    @PostMapping
    public ResponseEntity<Turno> registrarTurno(@RequestBody Turno turno){
        ResponseEntity<Turno> respuesta;
        //preguntar si es un paciente correcto y un odontologo correcto
        Paciente pacienteBus=pacienteService.buscar(turno.getPaciente().getId());
        Odontologo odontologoBus=odontologoService.buscar(turno.getOdontologo().getId());

        if (pacienteBus!=null && odontologoBus!=null){
            respuesta= ResponseEntity.ok(turnoService.registrarTurno(turno));
        }
        else{
            respuesta=ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return respuesta;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable int id){
        ResponseEntity<String> response;


        if (turnoService.buscar(id)!=null){
            //si existe
            turnoService.eliminar(id);

            response = ResponseEntity.status(HttpStatus.OK).body("Turno con id = " + id + " ha sido eliminado");
        }else{
            response=ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontro un turno con el id="+id);
        }
        return response;
    }

    @PutMapping
    public ResponseEntity<Turno> actualizarTurno(@RequestBody Turno turno) {
        ResponseEntity<Turno> respuesta;
        Paciente pacienteBus = pacienteService.buscar(turno.getPaciente().getId());
        Odontologo odontologoBus = odontologoService.buscar(turno.getOdontologo().getId());
        if (pacienteBus != null && odontologoBus != null) {
            return ResponseEntity.ok(turnoService.actualizar(turno));
        } else {
            respuesta = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return respuesta;
    }

}
