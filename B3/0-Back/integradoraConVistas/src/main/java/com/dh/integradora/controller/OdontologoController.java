package com.dh.integradora.controller;

import com.dh.integradora.dao.OdontologoDAOH2;
import com.dh.integradora.dominio.Odontologo;
import com.dh.integradora.service.OdontologoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    private OdontologoService odontologoService= new OdontologoService(new OdontologoDAOH2());
    @GetMapping
    public List<Odontologo> buscarTodosOdontologos(){
        return odontologoService.buscarTodos();
    }
    @PostMapping
    public Odontologo registrarOdontologo(@RequestBody Odontologo odontologo){
        return odontologoService.registrarOdontologo(odontologo);
    }
}
