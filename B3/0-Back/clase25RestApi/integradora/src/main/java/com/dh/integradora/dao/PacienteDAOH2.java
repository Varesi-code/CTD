package com.dh.integradora.dao;

import com.dh.integradora.dominio.Domicilio;
import com.dh.integradora.dominio.Paciente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
        return null;
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
}
