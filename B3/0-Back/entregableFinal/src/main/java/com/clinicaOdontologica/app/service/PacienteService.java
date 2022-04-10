package com.clinicaOdontologica.app.service;


import com.clinicaOdontologica.app.entities.Paciente;
import com.clinicaOdontologica.app.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository repository;

    public List<Paciente> buscarTodos() {
        return repository.findAll();
    }

    public Paciente guardar(Paciente paciente) {
        return repository.save(paciente);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    public Paciente buscar(Long id) {
        //return repository.findById(id).orElse(null);
        //optional significa que puede ser un paciente u otra cosa como nullo. se puede comprobar con el metodo isPresent()
        Optional<Paciente> paciente = repository.findById(id);
        if(paciente.isPresent()) {
            return paciente.get();
        }
        return null;
    }
    // public Optional<Paciente> buscarPorId(Long id) {
    //     return repository.findById(id);
    // }

    public Paciente actualiza(Paciente paciente) {
        return repository.save(paciente);
    }

}
