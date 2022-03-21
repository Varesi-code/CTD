package clinica.service;

import clinica.dao.IDao;
import clinica.modelo.Odontologo;

import java.util.List;

public class OdontologoService {
    private IDao <Odontologo> odontologoIDao;

    public OdontologoService (IDao <Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public void OdontologoDaoH2(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public void agregarOdontologo(Odontologo odontologo){
        odontologoIDao.insert(odontologo);
    }

    public void modificarOdontologo(Odontologo odontologo){
        odontologoIDao.update(odontologo);
    }

    public void eliminarOdontologo(int matricula){
        odontologoIDao.delete(matricula);
    }

    public Odontologo buscarOdontologo(int matricula){
        return odontologoIDao.find(matricula);
    }

    public List <Odontologo> todos(){
        return odontologoIDao.listAll();
    }
}


