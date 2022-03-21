package presencial.servicio;

import presencial.dao.IDao;
import presencial.modelo.Paciente;

public class PacienteService {
    private IDao<Paciente> pacienteDao;

    public PacienteService(IDao<Paciente> pacienteDao) {
        this.pacienteDao = pacienteDao;
    }

    public Paciente guardar(Paciente paciente){
        return pacienteDao.guardar(paciente);
    }
    public Paciente buscar(int id){
        return pacienteDao.buscar(id);
    }
}
