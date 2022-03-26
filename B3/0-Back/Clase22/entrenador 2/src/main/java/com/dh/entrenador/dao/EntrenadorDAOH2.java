package com.dh.entrenador.dao;

import com.dh.entrenador.dominio.Entrenador;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Component
public class EntrenadorDAOH2 implements IDao<Entrenador>{

    // establecer la conexión a la BD
    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/clase22","sa","sa");
    }

    @Override
    public List<Entrenador> buscarElementos() {
        Connection connection=null;
        List<Entrenador> listaEntrenadores=new ArrayList<>();
        try{
            //conectar a la base
            connection=getConnection();
            //preparar una consulta de tipo select
            PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM  entrenadores");
            ResultSet rs= preparedStatement.executeQuery();
            while (rs.next()){
                //cargar los elementos a una lista
                Entrenador entrenador= new Entrenador(rs.getInt(1),rs.getString(2));
                listaEntrenadores.add(entrenador);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        //devolver la lista llena
        return listaEntrenadores;
    }
}
