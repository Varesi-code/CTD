package com.dh.integradora.service;

import com.dh.integradora.dao.IDao;
import com.dh.integradora.Entities.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacienteService implements PacienteServiceInterface{
    @Autowired
    private IDao<Paciente> pacienteIDao;


    @Override
    public List<Paciente> listarPacientes() {
        return pacienteIDao.listarElementos();
    }

    @Override
    public Paciente buscarXEmail(String email) {
        return pacienteIDao.buscarEmail(email);
    }


    //clase 25
    @Override
    public Paciente guardar(Paciente paciente) {
        return pacienteIDao.guardar(paciente);
    }

    @Override
    public Paciente actualizar(Paciente paciente) {
        return pacienteIDao.actualizar(paciente);
    }

    @Override
    public Paciente buscar(int id) {
        return pacienteIDao.buscarId(id);
    }

    @Override
    public void eliminar(int id) {
        pacienteIDao.eliminar(id);
    }
}
