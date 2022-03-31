package com.clinicaOdontologica.clinica.service;
import com.clinicaOdontologica.clinica.dao.IDao;
import com.clinicaOdontologica.clinica.dominio.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService implements PacienteServiceInterface {
    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    // trabajar con el DAO
    @Override
    public List<Paciente> listAllPacientes() {
        return pacienteIDao.listAll();
    }

    @Override
    public Paciente findEmailPaciente(String email) {
        return pacienteIDao.findEmail(email);
    }

    //clase25

    @Override
    public Paciente insertPaciente(Paciente paciente) {
        return pacienteIDao.insert(paciente);
    }

    @Override
    public Paciente updatePaciente(Paciente paciente) {
        return pacienteIDao.update(paciente);
    }


    @Override
    public void deletePaciente(int id) {
        pacienteIDao.delete(id);
    }

    @Override
    public Paciente findPaciente(int id) {
        return pacienteIDao.find(id);
    }

}
