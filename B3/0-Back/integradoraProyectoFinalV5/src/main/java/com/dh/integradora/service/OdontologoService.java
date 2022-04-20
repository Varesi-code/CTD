package com.dh.integradora.service;

import com.dh.integradora.dao.IDao;
import com.dh.integradora.Entities.Odontologo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OdontologoService {
    @Autowired
    private IDao<Odontologo> odontologoIDao;



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
