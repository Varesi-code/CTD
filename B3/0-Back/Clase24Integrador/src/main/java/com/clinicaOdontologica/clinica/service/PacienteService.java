package com.clinicaOdontologica.clinica.service;
import com.clinicaOdontologica.clinica.dao.IDao;
import com.clinicaOdontologica.clinica.dominio.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService implements PacienteServiceInterface{
    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    // trabajar con el DAO
    @Override
    public List<Paciente> listAll() {
        return pacienteIDao.listAll();
    }

    @Override
    public Paciente buscarXEmail(String email) {
        return null;
    }

    //clase25

    @Override
    public Paciente guardar(Paciente paciente) {
        return pacienteIDao.insert(paciente);
    }

    @Override
    public Paciente actualizar(Paciente paciente) {
        return null;
    }
}
