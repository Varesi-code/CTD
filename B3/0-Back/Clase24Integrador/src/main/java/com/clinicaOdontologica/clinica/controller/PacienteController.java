package com.clinicaOdontologica.clinica.controller;
import com.clinicaOdontologica.clinica.dominio.Paciente;
import com.clinicaOdontologica.clinica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    /*
    private final PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

     */


    //vista
    @GetMapping("/index")
    public String traerPaciente(Model model, @RequestParam("email") String email){
        //buscar al paciente con el email
        Paciente paciente= pacienteService.findEmailPaciente(email);
        model.addAttribute("nombre",paciente.getNombre());
        model.addAttribute("apellido",paciente.getApellido());
        return "index";
    }
    //api metodos
    @PostMapping
    public Paciente registerPaciente(@RequestBody Paciente paciente){
        return pacienteService.insertPaciente(paciente);
    }

    @PutMapping
    public Paciente updatePaciente(@RequestBody Paciente paciente){
        return pacienteService.updatePaciente(paciente);
    }

    @GetMapping( "/{id}")
    public Paciente findPaciente(@PathVariable int id){
        return pacienteService.findPaciente(id);
    }

    @DeleteMapping( "/{id}")
    public String deletePaciente(@PathVariable int id){
        String message="Error al eliminar";
        if(pacienteService.findPaciente(id)!=null){
            pacienteService.deletePaciente(id);
            message="Paciente eliminado";
        }
        return message;
    }

    @GetMapping
    public Iterable<Paciente> listAllPacientes(){
        return pacienteService.listAllPacientes();
    }




}
