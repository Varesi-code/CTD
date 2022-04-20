package com.dh.integradora.controller;

import com.dh.integradora.Entities.Paciente;
import com.dh.integradora.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private  PacienteService pacienteService;




    @GetMapping("/index")
    public String traerPaciente(Model model, @RequestParam("email") String email){
        Paciente paciente=pacienteService.buscarXEmail(email);
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

    @GetMapping("/{id}")
    public Paciente buscarPaciente(@PathVariable int id){
        return pacienteService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public String eliminarPaciente(@PathVariable int id){
        String resp="Error en el id ingresado";
        if (pacienteService.buscar(id)!=null){
            pacienteService.eliminar(id);
            resp="Finalizado, se elimino el paciente con id="+id;
        }
        return resp;
    }
    @GetMapping
    public List<Paciente> buscarPacientes(){
        return pacienteService.listarPacientes();
    }
}
