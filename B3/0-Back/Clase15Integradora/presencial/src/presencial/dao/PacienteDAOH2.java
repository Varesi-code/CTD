package presencial.dao;

import presencial.modelo.Paciente;

public class PacienteDAOH2 implements IDao<Paciente> {
    public Paciente guardar(Paciente paciente) {
        return paciente;
    }

    public Paciente buscar(int id) {
        return new Paciente(id, "Paciente " + id, "Paciente " + id + " de la base de datos");
    }
}

}

