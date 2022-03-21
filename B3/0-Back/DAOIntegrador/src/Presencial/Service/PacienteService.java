package Presencial.Service;

import Presencial.Dao.IDao;
import Presencial.modelo.Paciente;

public class PacienteService {
    private IDao<Paciente> pacienteDao;

    public PacienteService(IDao<Paciente> pacienteDao) {
        this.pacienteDao = pacienteDao;
    }

    public Paciente insert(Paciente paciente){
        return pacienteDao.insert(paciente);
    }

    public Paciente select(int id){
        return pacienteDao.select(id);
    }

    public String delete(int id){
        return pacienteDao.delete(id);
    }
}
