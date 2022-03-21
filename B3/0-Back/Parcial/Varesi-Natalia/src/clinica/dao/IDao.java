package clinica.dao;

import clinica.modelo.Odontologo;

import java.util.List;

public interface IDao <T>{
    //create
    T insert(Odontologo odontologo);
    //read
    T find(int matricula);
    //update
    T update(Odontologo odontologo);
    //delete
    void delete(int matricula);
    //listAll
    List<T> listAll();
}


