package com.clinicaOdontologica.app.service;

import com.clinicaOdontologica.app.entities.Domicilio;
import com.clinicaOdontologica.app.repository.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DomicilioService {
    @Autowired
    DomicilioRepository repository;

    public Optional<Domicilio> buscar(Long id){
        return repository.findById(id);
    }

    public List<Domicilio> buscarTodos(){
        return repository.findAll();
    }

    public Domicilio registrarDomicilio(Domicilio domicilio){
        return repository.save(domicilio);
    }

    public void eliminarDomicilio(Long id){
        repository.deleteById(id);
    }

    public Domicilio actualizar(Domicilio domicilio){
        if (buscar(domicilio.getId()).isPresent())
            return repository.save(domicilio);
        else
            return null;
    }
}
