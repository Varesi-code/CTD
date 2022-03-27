package com.dh.entrenador.dao;

import com.dh.entrenador.dominio.Entrenador;

import java.sql.Connection;
import java.util.List;

public class EntrenadorDAOH2 implements IDao <Entrenador> {


    //establecer la conexion con la base de datos
    private static Connection getConnection() {
        Connection conn = null;

    }

    @Override
    public List<Entrenador> getAll() {
        return null;
    }
}
