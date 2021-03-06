package com.clinicaOdontologica.clinica.dao;


import java.util.List;

public interface IDao <T>{
    //guardar
    T insert(T t);
    //read
    T find(int id);
    //actualizar
    T update(T t);
    //delete
    void delete(int id);
    //listAll
    List<T> listAll();
    T findEmail(String email);
}


