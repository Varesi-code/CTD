package com.dh.integradora.dao;

import java.util.List;

public interface IDao<T>{
    List<T> listarElementos();
    T buscarId(int id);
    T buscarEmail(String email);

    //clase 25
    T guardar(T elemento);
    T actualizar(T elemento);

    void eliminar(int id);
}
