package com.clinicaOdontologica.app.controller;

import com.clinicaOdontologica.app.entities.Odontologo;
import com.clinicaOdontologica.app.exceptions.ResourceNotFoundException;
import com.clinicaOdontologica.app.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    @Autowired
    OdontologoService service;

    @GetMapping
    public List<Odontologo> buscarOdontologos(){
        return service.buscarTodos();
    }

    @GetMapping("/matricula={matricula}")
    public ResponseEntity<Odontologo> buscarOdontologoPorMatricula(@PathVariable int matricula){
        Optional<Odontologo> odontologoActualizado=service.buscarPorMatricula(matricula);
        if(odontologoActualizado.isPresent()){
            return ResponseEntity.ok(odontologoActualizado.get());
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public Odontologo registrarOdontologo(@RequestBody Odontologo odontologo){
        return service.registrarOdontologo(odontologo);
    }
    @PutMapping
    public ResponseEntity<Odontologo> actualizarOdontologo(@RequestBody Odontologo odontologo){
        Odontologo odontologoActualizado=service.actualizar(odontologo);
        if (odontologoActualizado!=null){
            return ResponseEntity.ok(odontologoActualizado);
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/id={id}")
    public ResponseEntity<Odontologo> buscarOdontologo(@PathVariable Long id){
        Optional<Odontologo> odontologoActualizado=service.buscar(id);
        if(odontologoActualizado.isPresent()){
            return ResponseEntity.ok(odontologoActualizado.get());
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/id={id}")
    public ResponseEntity<String> eliminarOdontologo(@PathVariable Long id) throws ResourceNotFoundException {
        service.eliminarOdontologo(id);
        return ResponseEntity.ok("Odontologo eliminado");

    }
}
