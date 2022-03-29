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
    private final PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping("/index")
    public String traerPaciente(Model model, @RequestParam("email") String email){
        //buscar al paciente con el email
        Paciente paciente= pacienteService.buscarPacienteXEmail(email);
        model.addAttribute("nombre",paciente.getNombre());
        model.addAttribute("apellido",paciente.getApellido());
        return "index";
    }
    @PostMapping
    public Paciente registrarPaciente(@RequestBody Paciente paciente){
        return pacienteService.guardar(paciente);
    }

    @PutMapping
    public Paciente actualizarPaciente(@RequestBody Paciente paciente){
        return pacienteService.actualizar(paciente);
    }

    @GetMapping( "/{id}")
    public Paciente buscarPaciente(@PathVariable int id){
        return pacienteService.buscar(id);
    }

    @DeleteMapping( "/{id}")
    public String eliminarPaciente(@PathVariable int id){
        String mensaje="Error al eliminar";
        if(pacienteService.buscar(id)!=null){
            pacienteService.eliminar(id);
            mensaje="Paciente eliminado";
        }
        return mensaje;
    }

    @GetMapping
    public Iterable<Paciente> listarPacientes(){
        return pacienteService.listAll();
    }




}
