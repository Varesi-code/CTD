package com.clinicaOdontologica.app.service;


import com.clinicaOdontologica.app.entities.Paciente;
import com.clinicaOdontologica.app.exceptions.ResourceNotFoundException;
import com.clinicaOdontologica.app.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PacienteService {
    @Autowired
    PacienteRepository repository;

    public List<Paciente> buscarTodos(){
        return repository.findAll();
    }

    public Optional<Paciente> buscarPorEmail(String email){
        return repository.findByEmail(email);
    }

    public Paciente guardar(Paciente p){
        return repository.save(p);
    }

    public void eliminar(Long id) throws ResourceNotFoundException {
        Optional<Paciente> pacienteBuscado=buscar(id);
        if (pacienteBuscado.isPresent()){
            repository.deleteById(id);
        }
        else{
            throw new ResourceNotFoundException("No existe el paciente con id: "+id+", no se puede borrar.");
        }
    }

    /*public Paciente buscar(Long id){
        Optional<Paciente> pas=repository.findById(id);
        if (pas.isPresent()){
            return pas.get();
        }
        else{
            return null;
        }

    }

     */

    public Optional<Paciente> buscar(Long id){
        return repository.findById(id);
    }

    public Paciente actualizar(Paciente p){
        Optional<Paciente> pacienteBuscado=buscar(p.getId());
        if (pacienteBuscado.isPresent())
            return repository.save(p);
        else
            return null;
    }

}
