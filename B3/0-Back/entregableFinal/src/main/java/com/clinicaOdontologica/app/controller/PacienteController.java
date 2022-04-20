package com.clinicaOdontologica.app.controller;

import com.clinicaOdontologica.app.entities.Paciente;
import com.clinicaOdontologica.app.exceptions.GlobalExceptions;
import com.clinicaOdontologica.app.exceptions.InternalServerException;
import com.clinicaOdontologica.app.exceptions.ResourceNotFoundException;
import com.clinicaOdontologica.app.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//todo - buscar todos
//todo - registrar
//todo - buscar por id
//todo - actualizar
//todo - eliminar

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    /*
    @GetMapping("/index")
    public String traerPaciente(Model model, @RequestParam("email") String email){
        Paciente paciente=pacienteService.buscarXEmail(email);
        model.addAttribute("nombre",paciente.getNombre());
        model.addAttribute("apellido",paciente.getApellido());
        return "index";
    }
 */

    @GetMapping
    public List<Paciente> buscarPacientes(){
        return pacienteService.buscarTodos();
    }

    @PostMapping
    public Paciente registrarPaciente(@RequestBody Paciente paciente){
        return pacienteService.guardar(paciente);
    }
    @PutMapping
    public ResponseEntity<Paciente> actualizarPaciente(@RequestBody Paciente paciente){
        Paciente pacienteActualizado=pacienteService.actualizar(paciente);
        if (pacienteActualizado!=null){
            return ResponseEntity.ok(pacienteActualizado);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/id={id}")
    public ResponseEntity<Paciente> buscarPaciente(@PathVariable Long id){
        Optional<Paciente> pacienteBuscado=pacienteService.buscar(id);
        if(pacienteBuscado.isPresent()){
            return ResponseEntity.ok(pacienteBuscado.get());
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @GetMapping("/mail={email}")
    public ResponseEntity<Paciente> buscarPacientePorEmail(@PathVariable String email) throws ResourceNotFoundException {
        Optional<Paciente> pacienteBuscado=pacienteService.buscarPorEmail(email);
        if(pacienteBuscado.isPresent()){
            return ResponseEntity.ok(pacienteBuscado.get());
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @DeleteMapping("/id={id}")
    public ResponseEntity<String> eliminarPaciente(@PathVariable Long id) throws ResourceNotFoundException, InternalServerException {
        pacienteService.eliminar(id);
        return ResponseEntity.ok("Paciente eliminado con id: "+id);
    }
    /*
    private final PacienteService pacienteService;
    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

     */
}
