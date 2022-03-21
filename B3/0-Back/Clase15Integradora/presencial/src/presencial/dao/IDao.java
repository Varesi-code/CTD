package presencial.dao;

import presencial.modelo.Paciente;

public interface IDao <T>{
    public guardar( T t);
    public buscar(Paciente id);
}


