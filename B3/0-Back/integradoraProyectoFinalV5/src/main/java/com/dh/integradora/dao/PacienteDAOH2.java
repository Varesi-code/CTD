package com.dh.integradora.dao;

import com.dh.integradora.Entities.Domicilio;
import com.dh.integradora.Entities.Paciente;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class PacienteDAOH2 implements IDao<Paciente>{
    //obtener la conexión
    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/clase23","sa","sa");
    }

    @Override
    public List<Paciente> listarElementos() {
        Connection connection=null;
        List<Paciente> listaPacientes= new ArrayList<>();
        Paciente paciente;
        Domicilio domicilio;
        //conectarnos
        //buscar las filas en la tabla pacientes
        //guardar los datos en una colección
        try{
            DomicilioDAOH2 domicilioDAOH2= new DomicilioDAOH2();
            connection=getConnection();
            PreparedStatement preparedStatement= connection.prepareStatement("SELECT * FROM pacientes");
            ResultSet rs= preparedStatement.executeQuery();
            while (rs.next()){
                domicilio=domicilioDAOH2.buscarId(rs.getInt(7));
                paciente= new Paciente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6).toLocalDate(),domicilio);
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

    @Override
    public Paciente buscarId(int id) {
        Connection connection=null;
        Paciente paciente=null;
        Domicilio domicilio;
        //conectarnos
        //buscar las filas en la tabla pacientes

        try{
            DomicilioDAOH2 domicilioDAOH2= new DomicilioDAOH2();
            connection=getConnection();
            PreparedStatement preparedStatement= connection.prepareStatement("SELECT * FROM pacientes WHERE id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs= preparedStatement.executeQuery();
            while (rs.next()){
                domicilio=domicilioDAOH2.buscarId(rs.getInt(7));
                paciente= new Paciente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6).toLocalDate(),domicilio);
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

    @Override
    public Paciente buscarEmail(String email) {
        Connection connection=null;
        Paciente paciente=null;
        Domicilio domicilio;
        //conectarnos
        //buscar las filas en la tabla pacientes

        try{
            DomicilioDAOH2 domicilioDAOH2= new DomicilioDAOH2();
            connection=getConnection();
            PreparedStatement preparedStatement= connection.prepareStatement("SELECT * FROM pacientes WHERE email=?");
            preparedStatement.setString(1,email);
            ResultSet rs= preparedStatement.executeQuery();
            while (rs.next()){
                domicilio=domicilioDAOH2.buscarId(rs.getInt(7));
                paciente= new Paciente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getDate(6).toLocalDate(),domicilio);
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

    //clase25
    @Override
    public Paciente guardar(Paciente elemento) {
        Connection connection = null;
        try {
            connection = getConnection();

            DomicilioDAOH2 domicilioDAOH2 = new DomicilioDAOH2();

            Domicilio domicilio = domicilioDAOH2.guardar(elemento.getDomicilio());
            elemento.getDomicilio().setId(domicilio.getId());

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO pacientes(nombre, " +
                    "apellido, email, dni, fecha_ingreso, domicilio_id) VALUES (?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, elemento.getNombre());
            preparedStatement.setString(2, elemento.getApellido());
            preparedStatement.setString(3, elemento.getEmail());
            preparedStatement.setInt(4, elemento.getDni());
            preparedStatement.setDate(5, Date.valueOf(elemento.getFechaIngreso()));
            preparedStatement.setInt(6, elemento.getDomicilio().getId());
            preparedStatement.executeUpdate();
            ResultSet claves = preparedStatement.getGeneratedKeys();
            while (claves.next()) {
                elemento.setId(claves.getInt(1));
            }
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return elemento;
    }

    @Override
    public Paciente actualizar(Paciente elemento) {
        Connection connection = null;
        try {
            connection = getConnection();
            DomicilioDAOH2 domicilioDAOH2 = new DomicilioDAOH2();
            domicilioDAOH2.actualizar(elemento.getDomicilio());

            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE pacientes SET nombre=?, " +
                    "apellido= ?, email=?, dni=?, fecha_ingreso=?, domicilio_id=? WHERE id=?");
            preparedStatement.setString(1, elemento.getNombre());
            preparedStatement.setString(2, elemento.getApellido());
            preparedStatement.setString(3, elemento.getEmail());
            preparedStatement.setInt(4, elemento.getDni());
            preparedStatement.setDate(5, Date.valueOf(elemento.getFechaIngreso()));
            preparedStatement.setInt(6, elemento.getDomicilio().getId());
            preparedStatement.setInt(7,elemento.getId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return elemento;
    }

    @Override
    public void eliminar(int id) {
        Connection connection = null;
        try {
            connection = getConnection();
            //elminar el domicilio con el id de this.domicilio.getId()
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM pacientes WHERE id=?");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
