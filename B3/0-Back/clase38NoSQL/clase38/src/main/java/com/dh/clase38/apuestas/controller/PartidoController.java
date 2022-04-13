package com.dh.clase38.apuestas.controller;

import com.dh.clase38.apuestas.model.Partido;
import com.dh.clase38.apuestas.service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/partidos")
public class PartidoController {
    @Autowired
    PartidoService service;

    @PostMapping
    public ResponseEntity<Partido> registrarPartido(@RequestBody Partido partido){
        return ResponseEntity.ok(service.agregar(partido));
    }
}
