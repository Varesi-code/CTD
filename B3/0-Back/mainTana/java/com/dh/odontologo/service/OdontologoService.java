package com.dh.odontologo.service;

import com.dh.odontologo.dao.IDao;
import com.dh.odontologo.domain.Odontologo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoService implements OdontologoServiceInterface {

   private IDao<Odontologo> odontologoDao;

   public OdontologoService (IDao<Odontologo> odontologoDao) {
      this.odontologoDao = odontologoDao;
   }

   @Override
   public List<Odontologo> listaOdontologos () {
      return odontologoDao.listarElementos ();
   }
}


