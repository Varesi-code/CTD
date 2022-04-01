package com.clinicaOdontologica.clinica.controller;

import com.clinicaOdontologica.clinica.dao.OdontologoDaoH2;
import com.clinicaOdontologica.clinica.dominio.Odontologo;
import com.clinicaOdontologica.clinica.dominio.Paciente;
import com.clinicaOdontologica.clinica.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologos" )
public class OdontologoController {

    @Autowired
    private OdontologoService odontologoService;

    @GetMapping
    public List<Odontologo> getOdontologos() {
        return odontologoService.all();
    }

    @PostMapping
    public Odontologo registerOdontologo(@RequestBody Odontologo odontologo){
        return odontologoService.insertOdontologo(odontologo);
    }
    @PutMapping
    public Odontologo updateOdontologo(@RequestBody Odontologo odontologo){
        return odontologoService.updateOdontologo(odontologo);
    }

    @GetMapping( "/{id}")
    public Odontologo findOdontologo(@PathVariable int id){
        return odontologoService.findOdontologo(id);
    }

    @DeleteMapping( "/{id}")
    public String deleteOdontologo(@PathVariable int id){
        String message="Error al eliminar";
        if(odontologoService.findOdontologo(id)!=null){
            odontologoService.deleteOdontologo(id);
            message="Odontólogo eliminado";
        }
        return message;
    }

    @GetMapping
    public Iterable<Odontologo> listAllOdontologos(){
        return odontologoService.all();
    }

    @GetMapping( "/{matricula}")
    public Odontologo getOdontologo(@PathVariable int matricula){
        return odontologoService.findOdontologo(matricula);
    }
}
