package com.dh.odontologo.dao;

import java.util.List;

public interface IDao <T> {
   T buscarId(int id);
   T eliminar(int id);
   T buscarEmail(String email);
   List<T> listarElementos ();

   //clase 25 pero lo hice antes
   //guardar -> insertar -> crear
   T guardar(T t);
   T actualizar(T t);
}




