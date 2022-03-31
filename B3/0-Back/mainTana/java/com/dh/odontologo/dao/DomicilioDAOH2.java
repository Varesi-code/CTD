package com.dh.odontologo.dao;

import com.dh.odontologo.domain.Domicilio;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.List;

@Component
public class DomicilioDAOH2 implements IDao<Domicilio> {

   //clase 25
   @Override
   public Domicilio guardar (Domicilio domicilio) {
      //conectarnos
      Connection connection = null;
      try {

         //preparar la info para insertar
         connection = getConnection ();

         PreparedStatement preparedStatement = connection.prepareStatement ("INSERT INTO domicilios (calle, numero, localidad, provincia) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
         preparedStatement.setString (1, domicilio.getCalle ());
         preparedStatement.setInt (2, domicilio.getNumero ());
         preparedStatement.setString (3, domicilio.getLocalidad ());
         preparedStatement.setString (4, domicilio.getProvincia ());

         //ejecutar
         preparedStatement.executeUpdate ();

         //busquemos el id generado >> TENEMOS UN RESULSET EN BASE A LAS CLAVES GENERADAS
         ResultSet rs = preparedStatement.getGeneratedKeys ();
         while (rs.next ()) {
            domicilio.setId (rs.getInt (1));
         }
         preparedStatement.close ();
      } catch (Exception e) {
         e.printStackTrace ();
      } finally {
         try {
            connection.close ();
         } catch (SQLException ex) {
            ex.printStackTrace ();
         }
      }
      return domicilio;
   }

   @Override
   public Domicilio actualizar (Domicilio domicilio) {
      //TODO ACTUALIZAR DOMICILIO
      return null;
   }

   @Override
   public Domicilio buscarId (int id) {

      //conectarnos
      Connection connection = null;
      Domicilio domicilio = null;

      try {

         //preparar la info para insertar
         connection = getConnection ();
         PreparedStatement preparedStatement = connection.prepareStatement ("SELECT * FROM domicilios WHERE ID=?");
         preparedStatement.setInt (1, id); //esto es lo que reemplaza el valor de la query donde está el ?
         ResultSet rs = preparedStatement.executeQuery ();
         while (rs.next ()) {
            domicilio = new Domicilio (
                  rs.getInt (1),
                  rs.getString (2),
                  rs.getInt (3),
                  rs.getString (4),
                  rs.getString (5));
         }

      } catch (Exception e) {
         e.printStackTrace ();
      } finally {
         try {
            connection.close ();
         } catch (SQLException ex) {
            ex.printStackTrace ();
         }
      }
      return domicilio;
   }

   @Override
   public Domicilio buscarEmail (String email) {
      //TODO BUSCAR DOMICILIO POR EMAIL --> NO SE USA
      return null;
   }

   @Override
   public List<Domicilio> listarElementos () {
      //TODO LISTAR TODOS LOS DOMICILIOS
      return null;
   }

   @Override
   public Domicilio eliminar (int id) {
      //todo ELIMINAR
      return null;
   }


   private static Connection getConnection () throws Exception{
      Class.forName ("org.h2.Driver").newInstance ();
      return DriverManager.getConnection ("jdbc:h2:~/integrador", "sa", "sa");
   }
}
