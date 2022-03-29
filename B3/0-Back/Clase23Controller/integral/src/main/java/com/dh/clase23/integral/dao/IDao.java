package com.dh.clase23.integral.dao;

import java.util.List;

public interface IDao <T>{
    List<T> listarElementos();
    T buscarId(int id);
    T buscarEmail(String email);
}
