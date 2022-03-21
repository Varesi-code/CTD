package Presencial.Dao;

import Presencial.DB;
import Presencial.modelo.Domicilio;
import Presencial.modelo.Paciente;

import javax.swing.text.html.HTMLDocument;
import java.sql.*;
import java.time.LocalDate;
import java.util.Calendar;

public class PacienteDAOH2 implements IDao<Paciente>{

    @Override
    public Paciente insert(Paciente paciente){
        Connection connection = null;
        String ls_sql = "INSERT INTO PACIENTES(" +
                "NOMBRE,APELLIDO,DNI,FECHA_INGRESO,DOMICILIO_ID)" +
                "VALUES(?,?,?,?,?)";

        try{
            //abro conexion
            connection = DB.getConnection();

            //Inserto primero domicilio
            DomicilioDAOH2 domicilioDAOH2 = new DomicilioDAOH2();
            domicilioDAOH2.insert(paciente.getDomicilio());

            //creo statement
            PreparedStatement psInsert = connection.prepareStatement(ls_sql,Statement.RETURN_GENERATED_KEYS);
            psInsert.setString(1,paciente.getNombre());
            psInsert.setString(2,paciente.getApellido());
            psInsert.setInt(3,paciente.getDni());
            psInsert.setDate(4,Date.valueOf(paciente.getFecha_ingreso()));
            psInsert.setInt(5,paciente.getDomicilio().getId());
            psInsert.executeUpdate();

            //busco Id generado
            ResultSet rs = psInsert.getGeneratedKeys();
            if(rs.next()){
                paciente.setId(rs.getInt(1));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }

        return paciente;
    }

    @Override
    public Paciente update(Paciente paciente) {
        return null;
    }

    @Override
    public Paciente select(int id) {
        Connection connection = null;
        String ls_sql = "SELECT * FROM PACIENTES WHERE ID=?";
        Domicilio domicilio = null;
        Paciente pacienteRet = null;

        try{
            //abro conexion
            connection = DB.getConnection();

            //busco domicilio
            DomicilioDAOH2 domicilioDAOH2 = new DomicilioDAOH2();
            domicilio =  domicilioDAOH2.select(id);

            //creo statement
            PreparedStatement psSelect = connection.prepareStatement(ls_sql);
            psSelect.setInt(1,id);

            ResultSet rs = psSelect.executeQuery();
             if(rs.next()){
                 pacienteRet = new Paciente(rs.getString("Nombre"),rs.getString("Apellido"),domicilio,
                         rs.getDate("fecha_ingreso").toLocalDate(),rs.getInt("dni"),rs.getInt("id"));
             }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }

        return pacienteRet;
    }

    @Override
    public String delete(int id) {
        Connection connection = null;
        String ls_sql = "DELETE FROM PACIENTES WHERE ID=?";
        String msj = "No se pudo eliminar!";

        try{
            //abro conexion
            connection = DB.getConnection();

            //elimino domicilio
            DomicilioDAOH2 domicilioDAOH2 = new DomicilioDAOH2();
            domicilioDAOH2.delete(id);

            //creo statement
            PreparedStatement psSelect = connection.prepareStatement(ls_sql);
            psSelect.setInt(1,id);

            if( psSelect.execute()){
              msj = "Paciente eliminado con exito!";
            };

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }

        return msj;
    }

}
