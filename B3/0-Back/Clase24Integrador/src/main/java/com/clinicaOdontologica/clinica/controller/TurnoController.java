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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    private PacienteService pacienteService = new PacienteService(new PacienteDAOH2());
    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());
    private TurnoService turnoService = new TurnoService(new TurnoDAOLista());

    @GetMapping
    public ResponseEntity<List<Turno>> listarTurnos(){
        return ResponseEntity.ok(turnoService.listarTurnos());
    }

    @PostMapping
    public ResponseEntity<Turno> crearTurno(@RequestBody Turno turno ){
        ResponseEntity<Turno> respuesta;
        //preguntar si el turno ya existe y el odontologo tb (correctos)
        Paciente pacienteFind = pacienteService.findPaciente(turno.getPaciente().getId());
        Odontologo odontologoFind = odontologoService.findOdontologo((turno.getOdontologo().getMatricula()));

        if (pacienteFind!=null && odontologoFind!=null){
            respuesta = ResponseEntity.ok(turnoService.crearTurno(turno));
        }else{
            respuesta = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return respuesta;
    }
    ////response entity permite controlar la parte referida a la conexion http y la respuesta http
    ////@GetMapping("/{id}")
    ////public ResponseEntity<Turno> getTurno(@PathVariable("id") int id) {
    ////    Turno turno = new Turno();
    ////    turno.setId(id);
    ////    turno.setNombre("Turno " + id);
    ////    return new ResponseEntity<Turno>(turno, HttpStatus.OK);
    ////}
}


