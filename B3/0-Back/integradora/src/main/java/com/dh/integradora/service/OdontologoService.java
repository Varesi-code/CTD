package com.dh.integradora.service;

import com.dh.integradora.dao.IDao;
import com.dh.integradora.dominio.Odontologo;

import java.util.List;

public class OdontologoService {
    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo buscar(int id){
        return odontologoIDao.buscarId(id);
    }

    public List<Odontologo> buscarTodos(){
        return odontologoIDao.listarElementos();
    }

    public Odontologo registrarOdontologo(Odontologo odontologo){
        return odontologoIDao.guardar(odontologo);
    }
}
