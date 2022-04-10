package com.dh.clase31.presencial.controller;

import com.dh.clase31.presencial.entities.Movimiento;
import com.dh.clase31.presencial.service.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimientos")
public class MovimientoController {
    @Autowired
    MovimientoService service;

    @GetMapping
    public ResponseEntity<List<Movimiento>> traerMovimientos(){
        return ResponseEntity.ok(service.obtenerMovimientos());
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarMovimiento(@RequestBody Movimiento movimiento){
        ResponseEntity<String> respuesta = null;
        if (service.guardarMovimiento(movimiento)!=null){
            respuesta = ResponseEntity.ok("Movimiento guardado correctamente");
        }
        else{
            respuesta = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al guardar el movimiento");
        }
        return respuesta;
    }
}