package com.dh.clase31.presencial.service;

import com.dh.clase31.presencial.entities.Movimiento;
import com.dh.clase31.presencial.repository.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoService {
    @Autowired
    MovimientoRepository repository;

    public List<Movimiento> obtenerMovimientos() {
        return repository.findAll();
    }


    public String guardarMovimiento(Movimiento movimiento) {
        repository.save(movimiento);
        return "Movimiento guardado";
    }
}
