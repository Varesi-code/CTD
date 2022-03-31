package com.dh.odontologo.dao;

import com.dh.odontologo.domain.Domicilio;
import com.dh.odontologo.domain.Paciente;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.List;
@Component
public class PacienteDAOH2 implements IDao<Paciente> {


   @Override
   public Paciente guardar (Paciente paciente) {
      //conectarnos
      Connection connection = null;
      try{
         //guardar el domicilio
         DomicilioDAOH2 domicilioDAOH2 = new DomicilioDAOH2();
         //domicilioDAOH2.guardar (paciente.getDomicilio());
         Domicilio domicilio = domicilioDAOH2.guardar (paciente.getDomicilio ());
         paciente.getDomicilio ().setId (domicilio.getId ());

         //preparar la info para insertar
         connection = getConnection ();

        PreparedStatement preparedStatement = connection.prepareStatement ("INSERT INTO pacientes (nombre, apellido, email, dni, fecha_ingreso, domicilio_id) VALUES (?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString (1, paciente.getNombre ());
        preparedStatement.setString (2, paciente.getApellido ());
        preparedStatement.setString (3, paciente.getEmail ());
        preparedStatement.setInt (4, paciente.getDni ());
        preparedStatement.setDate(5, Date.valueOf (paciente.getFechaIngreso ()));
        preparedStatement.setInt (6, paciente.getDomicilio ().getId ());

         //ejecutar
         preparedStatement.executeUpdate();

         //claves
         ResultSet rs = preparedStatement.getGeneratedKeys ();
         while (rs.next ()){
            paciente.setId (rs.getInt (1)); //traemos el id
         }
         preparedStatement.close ();
      }
      catch (Exception e){
         e.printStackTrace ();
      }
      finally {
         try {
            connection.close ();
         }
         catch (SQLException ex){
            ex.printStackTrace ();
         }
      }
      return paciente;
   }

   @Override
   public Paciente actualizar (Paciente paciente) {
      //TODO ACTUALIZAR PACIENTE
      return null;
   }

   @Override
   public Paciente buscarId (int id) {

      //conectarnos
      Connection connection = null;
      Paciente paciente = null;
      Domicilio domicilio;
      try{
         //guardar el domicilio
         DomicilioDAOH2 domicilioDAOH2 = new DomicilioDAOH2();

         //preparar la info para insertar
         connection = getConnection ();
         PreparedStatement preparedStatement = connection.prepareStatement ("SELECT * FROM pacientes WHERE ID=?");
         preparedStatement.setInt (1, id);
         ResultSet rs = preparedStatement.executeQuery ();

         while (rs.next ()){
            int id_domicilio = rs.getInt (6);
            domicilio = domicilioDAOH2.buscarId (id_domicilio);
            paciente = new Paciente (
                  rs.getInt (1),
                  rs.getString (2),
                  rs.getString (3),
                  rs.getString (4),
                  rs.getInt (5),
                  rs.getDate (6).toLocalDate (),
                  domicilio);
         }


         //ejecutar
         preparedStatement.executeQuery ();
      }
      catch (Exception e){
         e.printStackTrace ();
      }
      finally {
         try {
            connection.close ();
         }
         catch (SQLException ex){
            ex.printStackTrace ();
         }
      }

      return paciente;
   }


   @Override
   public Paciente buscarEmail (String email) {
      Connection connection = null;
      Paciente paciente = null;
      Domicilio domicilio;

      try{
         DomicilioDAOH2 domicilioDAOH2 = new DomicilioDAOH2 ();
         connection = getConnection ();
         PreparedStatement preparedStatement = connection.prepareStatement ("SELECT * FROM pacientes WHERE email=?");
         preparedStatement.setString (1, email);
         ResultSet rs = preparedStatement.executeQuery ();

         while (rs.next ()){
            domicilio = domicilioDAOH2.buscarId (rs.getInt (7));
            paciente = new Paciente (rs.getInt (1), rs.getString (2), rs.getString (3), rs.getString (4), rs.getInt(5), rs.getDate (6).toLocalDate (), domicilio);
         }
      }
      catch (Exception e){
         e.printStackTrace ();
      }
      finally {
         try {
            connection.close ();
         }
         catch (SQLException ex){
            ex.printStackTrace ();
         }
      }

      return paciente;
   }

   //TODO LISTAR PACIENTES
   @Override
   public List<Paciente> listarElementos () {

      return null;
   }

   //todo: implementar
   @Override
   public Paciente eliminar (int id) {
      return null;
   }


   //manejador privado de ayuda de conexión

   private static Connection getConnection () throws Exception{
      Class.forName ("org.h2.Driver").newInstance ();
      return DriverManager.getConnection ("jdbc:h2:~/integrador", "sa", "sa");
   }

}
