package com.clinicaOdontologica.clinica.service;
import com.clinicaOdontologica.clinica.dao.IDao;
import com.clinicaOdontologica.clinica.dominio.Turno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoService {

    private IDao<Turno> turnoIDao;

    public TurnoService(IDao<Turno> turnoIDao) {
        this.turnoIDao = turnoIDao;
    }

    public Turno crearTurno(Turno turno) {
        return turnoIDao.insert(turno);
    }

    public Turno modificarTurno(Turno turno) {
        return turnoIDao.update(turno);
    }

    public void eliminarTurno(int id) {
        turnoIDao.delete(id);
    }

    public Turno buscarTurno(int id) {
        return turnoIDao.find(id);
    }

    public List<Turno> listarTurnos() {
        return turnoIDao.listAll();
    }

}
