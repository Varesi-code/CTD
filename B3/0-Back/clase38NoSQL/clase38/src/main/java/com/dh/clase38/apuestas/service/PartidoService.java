package com.dh.clase38.apuestas.service;

import com.dh.clase38.apuestas.model.Partido;
import com.dh.clase38.apuestas.repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartidoService {
    @Autowired
    PartidoRepository repository;

    public Partido agregar(Partido partido){
        return repository.save(partido);
    }
}
