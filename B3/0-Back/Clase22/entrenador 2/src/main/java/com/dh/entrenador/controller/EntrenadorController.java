package com.dh.entrenador.controller;

import com.dh.entrenador.dominio.Entrenador;
import com.dh.entrenador.service.EntrenadorServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class EntrenadorController {
    private final EntrenadorServiceInterface entrenadorService;
    @Autowired
    public EntrenadorController(EntrenadorServiceInterface entrenadorService) {
        this.entrenadorService = entrenadorService;
    }
    @GetMapping("/entrenadores")
    public List<Entrenador> getEntrenadores(){
        return entrenadorService.listaEntrenadores();
    }
}
