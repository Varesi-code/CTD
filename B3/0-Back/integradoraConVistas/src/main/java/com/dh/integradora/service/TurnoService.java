package com.dh.integradora.service;

import com.dh.integradora.dao.IDao;
import com.dh.integradora.dominio.Turno;

import java.util.List;

public class TurnoService {
    private IDao<Turno> turnoIDao;

    public TurnoService(IDao<Turno> turnoIDao) {
        this.turnoIDao = turnoIDao;
    }

    public Turno registrarTurno(Turno turno){
        return turnoIDao.guardar(turno);
    }

    public List<Turno> listarTurno(){
        return turnoIDao.listarElementos();
    }
}
