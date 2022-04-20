package com.dh.integradora.service;

import com.dh.integradora.dao.IDao;
import com.dh.integradora.Entities.Turno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoService {
    @Autowired
    private IDao<Turno> turnoIDao;

    public Turno registrarTurno(Turno turno) {
        return turnoIDao.guardar(turno);
    }

    public List<Turno> listarTurno() {
        return turnoIDao.listarElementos();
    }

    public void eliminar(int id) {
        turnoIDao.eliminar(id);
    }

    public Turno actualizar(Turno turno) {
        return turnoIDao.actualizar(turno);

    }

    public Turno buscar(int id) {
        return turnoIDao.buscarId(id);
    }
}


