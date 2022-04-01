package com.clinicaOdontologica.clinica.service;
import com.clinicaOdontologica.clinica.dao.IDao;
import com.clinicaOdontologica.clinica.dominio.Odontologo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoService {
    @Autowired
    private IDao <Odontologo> odontologoIDao;

    public void OdontologoDaoH2(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo insertOdontologo(Odontologo odontologo){
        return odontologoIDao.insert(odontologo);
    }

    public Odontologo updateOdontologo(Odontologo odontologo){
        odontologoIDao.update(odontologo);
        return odontologo;
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


