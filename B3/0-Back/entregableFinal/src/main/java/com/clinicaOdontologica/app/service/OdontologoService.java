package com.clinicaOdontologica.app.service;
import com.clinicaOdontologica.app.entities.Odontologo;
import com.clinicaOdontologica.app.exceptions.BadRequestException;
import com.clinicaOdontologica.app.exceptions.ResourceNotFoundException;
import com.clinicaOdontologica.app.repository.OdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//todo


@Service
public class OdontologoService {
    @Autowired
    OdontologoRepository repository;

    public Optional<Odontologo> buscar(Long id) throws ResourceNotFoundException {
        Optional<Odontologo> odontologoBuscado= repository.findById(id);
        if (odontologoBuscado.isPresent()){
            return odontologoBuscado;
        }else{
            throw new ResourceNotFoundException("No se puede encontrar el odontologo con id: "+id+", error al buscar");
        }
    }

    public Optional<Odontologo> buscarPorMatricula(int matricula) throws ResourceNotFoundException {
        Optional<Odontologo> odontologoBuscado= repository.findByMatricula(matricula);
        if (odontologoBuscado.isPresent()){
            return odontologoBuscado;
        } else {
            throw new ResourceNotFoundException("No se puede encontrar el odontologo con matricula: "+matricula+".");
        }
    }

    public List<Odontologo> buscarTodos() throws BadRequestException{
        List<Odontologo> odontologos= repository.findAll();
        if (odontologos.isEmpty()){
            throw new BadRequestException("No hay odontologos registrados.");
        }else{
            return odontologos;
        }
    }

    public Odontologo registrarOdontologo(Odontologo odontologo) throws BadRequestException, ResourceNotFoundException {
        if (buscarPorMatricula(odontologo.findById()).isPresent())
            throw new BadRequestException("Ya existe un odontologo con matricula: "+odontologo.getMatricula()+".");
        else
            return repository.save(odontologo);
    }

    public void eliminarOdontologo(Long id) throws ResourceNotFoundException {
        Optional<Odontologo> odontologoBuscado= buscar(id);
        if (odontologoBuscado.isPresent()){
            repository.deleteById(id);
        }
        else{
            throw new ResourceNotFoundException("No se puede borrar el odontologo con id: "+id+", error al borrar");
        }
    }

    public Odontologo actualizar(Odontologo odontologo) throws ResourceNotFoundException {
        Optional<Odontologo> odontologoBuscado= buscar(odontologo.getId());
        if (odontologoBuscado.isPresent())
            return repository.save(odontologo);
        else
            return null;
    }
}
