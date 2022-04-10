package com.example.clase34.profe.service;


import com.example.clase34.profe.entities.Jugador;
import com.example.clase34.profe.entities.Tecnico;
import com.example.clase34.profe.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    TecnicoRepository repository;

    public Tecnico agregarJugador(Jugador jugador, Long id){
        Optional<Tecnico> tecnico = repository.findById(id);
        if(tecnico.isPresent()){
            Tecnico tec = tecnico.get();
            jugador.setTecnico(tec);
            tec.getJugadores().add(jugador);
            return repository.save(tec);
        }else {
            return null;
        }
    }

    public Optional<Tecnico> buscarTecnicoPorNombre(String nombre){
        return repository.buscarTecnicoPorNombre(nombre);
    }

}
