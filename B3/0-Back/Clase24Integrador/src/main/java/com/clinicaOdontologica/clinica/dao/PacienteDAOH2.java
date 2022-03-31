package com.clinicaOdontologica.clinica.dao;
import com.clinicaOdontologica.clinica.dominio.Domicilio;
import com.clinicaOdontologica.clinica.dominio.Paciente;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PacienteDAOH2 implements IDao<Paciente>{
    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/clinica","sa","sa");
    }
    //////////////////// add new  "paciente" //////////////////////
    @Override
    public Paciente insert(Paciente paciente) {
        Connection connection = null;
        try{
            connection=getConnection();
            //llamo domicilio y guardo id en paciente
            DomicilioDAOH2 domicilioDAOH2= new DomicilioDAOH2();
            Domicilio domicilio= domicilioDAOH2.insert(paciente.getDomicilio());
            paciente.getDomicilio().setId(domicilio.getId());
            //insert paciente
            //preparo statement
            PreparedStatement preparedStatement= connection.prepareStatement("INSERT INTO pacientes(apellido,nombre,email,dni,fecha_ingreso,domicilio_id) VALUES(?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,paciente.getApellido());
            preparedStatement.setString(2,paciente.getNombre());
            preparedStatement.setString(3,paciente.getEmail());
            preparedStatement.setInt(4,paciente.getDni());
            preparedStatement.setDate(5,Date.valueOf(paciente.getFechaIngreso()));
            preparedStatement.setInt(6,paciente.getDomicilio().getId());
            //ejecuto
            preparedStatement.executeUpdate();
            //obtengo id
            ResultSet keys= preparedStatement.getGeneratedKeys();
            while (keys.next()){
                paciente.setId(keys.getInt(1));
            }

        }
        catch (Exception e){
            e.printStackTrace();

        }
        finally {
            try{
                connection.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        return paciente;

    }
    //////////////////// actualizar //////////////////////
    @Override
    public Paciente update(Paciente paciente) {
        Connection connection = null;
        try {
            connection = getConnection();
            //llamo domicilio y guardo id en paciente
            DomicilioDAOH2 domicilioDAOH2 = new DomicilioDAOH2();
            Domicilio domicilio = domicilioDAOH2.insert(paciente.getDomicilio());
            paciente.getDomicilio().setId(domicilio.getId());
            //insert paciente
            //preparo statement
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE pacientes SET apellido = ?, nombre = ?, email = ?, dni = ?, fecha_ingreso = ?, domicilio_id = ? WHERE id = ?");
            preparedStatement.setString(1, paciente.getApellido());
            preparedStatement.setString(2, paciente.getNombre());
            preparedStatement.setString(3, paciente.getEmail());
            preparedStatement.setInt(4, paciente.getDni());
            preparedStatement.setDate(5, Date.valueOf(paciente.getFechaIngreso()));
            preparedStatement.setInt(6, paciente.getDomicilio().getId());
            preparedStatement.setInt(7, paciente.getId());
            //ejecuto
            preparedStatement.executeUpdate();
            //obtengo id
            ResultSet keys = preparedStatement.getGeneratedKeys();
            while (keys.next()) {
                paciente.setId(keys.getInt(1));
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return paciente;
        }

    }
    //////////////////// delete "paciente" //////////////////////
    @Override
    public void delete(int id) {
        Connection connection = null;
        try {
            connection = getConnection();
            //insert paciente
            //preparo statement
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM pacientes WHERE id = ?");
            preparedStatement.setInt(1, id);
            //ejecuto
            preparedStatement.executeUpdate();
            preparedStatement.close();
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
    }
    //////////////////// list all "pacientes" //////////////////////
    @Override
    public List<Paciente> listAll() {
        Connection connection= null;
        List<Paciente> listaPacientes= new ArrayList<>();
        Paciente paciente= null;
        Domicilio domicilio=null;

        try{
            DomicilioDAOH2 domicilioDAOH2= new DomicilioDAOH2();
            connection=getConnection();
            PreparedStatement preparedStatement= connection.prepareStatement("SELECT * FROM pacientes");
            ResultSet rs= preparedStatement.executeQuery();
            while (rs.next()){
                int id_dom=rs.getInt(7);
                domicilio=domicilioDAOH2.find(id_dom);
                paciente=new Paciente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6).toLocalDate(),domicilio);
                listaPacientes.add(paciente);
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
        return listaPacientes;
    }

    //////////////////// find "paciente" by id//////////////////////
    @Override
    public Paciente find(int id) {
        Connection connection= null;
        Paciente paciente= null;
        Domicilio domicilio;

        try{
            DomicilioDAOH2 domicilioDAOH2= new DomicilioDAOH2();
            connection=getConnection();
            PreparedStatement preparedStatement= connection.prepareStatement("SELECT * FROM pacientes WHERE id=?");
            preparedStatement.setInt(1, id);
            ResultSet rs= preparedStatement.executeQuery();
            while (rs.next()){
                int id_dom=rs.getInt(7);
                domicilio=domicilioDAOH2.find(id_dom);
                paciente=new Paciente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6).toLocalDate(),domicilio);
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
        return paciente;
    }
    //////////////////// find "paciente" by email //////////////////////


    public Paciente findEmail(String email) {
        Connection connection= null;
        Paciente paciente= null;
        Domicilio domicilio=null;

        try{
            DomicilioDAOH2 domicilioDAOH2= new DomicilioDAOH2();
            connection=getConnection();
            PreparedStatement preparedStatement= connection.prepareStatement("SELECT * FROM pacientes WHERE email LIKE ?");
            preparedStatement.setString(1,email);
            ResultSet rs= preparedStatement.executeQuery();
            while (rs.next()){
                int id_dom=rs.getInt(7);
                domicilio=domicilioDAOH2.find(id_dom);
                paciente=new Paciente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6).toLocalDate(),domicilio);
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
        return paciente;
    }
}
