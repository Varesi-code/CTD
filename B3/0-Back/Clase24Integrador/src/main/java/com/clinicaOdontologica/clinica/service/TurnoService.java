package com.clinicaOdontologica.clinica.service;
import com.clinicaOdontologica.clinica.dao.IDao;
import com.clinicaOdontologica.clinica.dominio.Turno;
import java.util.List;

public class TurnoService {

    private IDao<Turno> turnoIDao;

    public TurnoService(IDao<Turno> turnoIDao) {
        this.turnoIDao = turnoIDao;
    }

    public Turno crearTurno(Turno turno) {
        return turnoIDao.insert(turno);
    }

    public void modificarTurno(Turno turno) {
        turnoIDao.update(turno);
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
