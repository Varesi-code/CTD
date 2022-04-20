package com.dh.integradora.controller;

import com.dh.integradora.Entities.Odontologo;
import com.dh.integradora.service.OdontologoService;
import com.dh.integradora.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologos")

public class OdontologoController {
    @Autowired
    private TurnoService turnoService;
    @Autowired
    private OdontologoService odontologoService;
    @GetMapping
    public List<Odontologo> buscarTodosOdontologos(){
        return odontologoService.buscarTodos();

    }
    @PostMapping
    public Odontologo registrarOdontologo(@RequestBody Odontologo odontologo){
         return odontologoService.registrarOdontologo(odontologo);

    }
}
