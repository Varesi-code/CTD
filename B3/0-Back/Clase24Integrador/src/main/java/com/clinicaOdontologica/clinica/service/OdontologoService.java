package com.clinicaOdontologica.clinica.service;
import com.clinicaOdontologica.clinica.dao.IDao;
import com.clinicaOdontologica.clinica.dominio.Odontologo;

import java.util.List;

public class OdontologoService {
    private IDao <Odontologo> odontologoIDao;
    //constructor
    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public void OdontologoDaoH2(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public void insertOdontologo(Odontologo odontologo){
        odontologoIDao.insert(odontologo);
    }

    public void updateOdontologo(Odontologo odontologo){
        odontologoIDao.update(odontologo);
    }

    public void deleteOdontologo(int matricula){
        odontologoIDao.delete(matricula);
    }

    public Odontologo findOdontologo(int matricula){
        return odontologoIDao.find(matricula);
    }

    public List <Odontologo> all(){
        return odontologoIDao.listAll();
    }
}


