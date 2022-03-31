package com.dh.odontologo.dao;

import com.dh.odontologo.domain.Odontologo;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class OdontologoDAOH2 implements IDao<Odontologo> {


   @Override
   public Odontologo guardar (Odontologo odontologo) {
      return null;
   }

   @Override
   public Odontologo actualizar (Odontologo odontologo) {
      //TODO IMPLEMENTAR ACTUALIZAR ODONTOLOGO CLASE 25
      return null;
   }

   @Override
   public Odontologo buscarId (int id) {
      return null;
   }

   @Override
   public Odontologo eliminar (int id) {
      return null;
   }

   @Override
   public Odontologo buscarEmail (String email) {
      return null;
   }

   @Override
   public List<Odontologo> listarElementos () {
      Connection connection = null;
      List<Odontologo> odontologos = new ArrayList<> ();
      try{
         connection = getConnection ();

         PreparedStatement preparedStatement = connection.prepareStatement ("SELECT * FROM odontologos");
         ResultSet rs = preparedStatement.executeQuery ();

         while (rs.next ()) {
            Odontologo odontologo = new Odontologo (
                  rs.getInt (1),
                  rs.getString (2)
            );
            odontologos.add (odontologo);
         }

      }catch (Exception e){
         e.printStackTrace ();
      } finally {
         try {
            connection.close();
         } catch (SQLException e) {
            e.printStackTrace ();
         }
      }
      return odontologos;
   }


   //establecer conexión
   private static Connection getConnection () throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
      Class.forName ("org.h2.Driver").newInstance ();
      return DriverManager.getConnection ("jdbc:h2:~/integrador", "sa", "sa");
   }
}
