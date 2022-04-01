package com.clinicaOdontologica.clinica.dao;

import com.clinicaOdontologica.clinica.dominio.Odontologo;
import com.clinicaOdontologica.clinica.dominio.Paciente;
import com.clinicaOdontologica.clinica.dominio.Turno;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TurnoDAOLista implements IDao <Turno> {
    private List<Turno> turnos;
    
    public TurnoDAOLista(){
        turnos = new ArrayList<>();
        PacienteDAOH2 pacienteDAOH2 = new PacienteDAOH2();
        OdontologoDaoH2 odontologoDaoH2 = new OdontologoDaoH2();
        Paciente paciente = pacienteDAOH2.find(1);
        Odontologo odontologo = odontologoDaoH2.find(1);
        Turno turno1 = new Turno(1, odontologo, paciente, LocalDate.now());
        turnos.add(turno1);
    }

    @Override
    public Turno insert(Turno turno) {
        turnos.add(turno);
        return turno;
    }

    @Override
    public Turno find(int id) {
        for (Turno turno : turnos) {
            if (turno.getId() == id) {
                return turno;
            }
        }
        return null;
    }

    @Override
    public Turno update(Turno turno) {
        delete(turno.getId());
        turnos.add(turno);
        return turno;
    }

    @Override
    public void delete(int id) {
        for (Turno turno : turnos) {
            if (turno.getId() == id) {
                turnos.remove(turno);
                break;
            }
        }
    }

    @Override
    public List<Turno> listAll() {
        return turnos;
    }

    @Override
    public Turno findEmail(String email) {
        return null;
    }
}
