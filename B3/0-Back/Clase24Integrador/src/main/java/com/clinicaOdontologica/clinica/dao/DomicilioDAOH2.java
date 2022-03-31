package com.clinicaOdontologica.clinica.dao;

import com.clinicaOdontologica.clinica.dominio.Domicilio;


import java.sql.*;
import java.util.List;

public class DomicilioDAOH2 implements IDao<Domicilio>{
    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/clinica","sa","sa");
    }

    @Override
    public List<Domicilio> listAll() {
        return null;
    }

    @Override
    public Domicilio insert(Domicilio domicilio) {
        Connection connection= null;
        try{
            connection=getConnection();
            //preparo sentencia
            PreparedStatement preparedStatement= connection.prepareStatement("INSERT INTO domicilios (calle,numero,localidad,provincia) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            //seteo los parametros
            preparedStatement.setString(1,domicilio.getCalle());
            preparedStatement.setInt(2,domicilio.getNumero());
            preparedStatement.setString(3,domicilio.getLocalidad());
            preparedStatement.setString(4,domicilio.getProvincia());
            //ejecuto la sentencia
            preparedStatement.executeUpdate();
            //obtengo el id generado
            ResultSet keys=preparedStatement.getGeneratedKeys();
            //inserto el id generado en el objeto domicilio
            while (keys.next()){
                domicilio.setId(keys.getInt(1));
            }
            //cierro la stament
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
        return domicilio;
    }

    @Override
    public Domicilio find(int id) {
        Connection connection= null;
        Domicilio domicilio=null;

        try{
            connection=getConnection();
            PreparedStatement preparedStatement= connection.prepareStatement("SELECT * FROM domicilios WHERE id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                domicilio= new Domicilio(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5));
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
        return domicilio;
    }

    @Override
    public Domicilio update(Domicilio domicilio) {
        Connection connection= null;
        try{
            connection=getConnection();
            //preparo sentencia
            PreparedStatement preparedStatement= connection.prepareStatement("UPDATE domicilios SET calle=?,numero=?,localidad=?,provincia=? WHERE id=?");
            //seteo los parametros
            preparedStatement.setString(1,domicilio.getCalle());
            preparedStatement.setInt(2,domicilio.getNumero());
            preparedStatement.setString(3,domicilio.getLocalidad());
            preparedStatement.setString(4,domicilio.getProvincia());
            preparedStatement.setInt(5,domicilio.getId());
            //ejecuto la sentencia
            preparedStatement.executeUpdate();
            //obtengo el id generado
            ResultSet keys=preparedStatement.getGeneratedKeys();
            //inserto el id generado en el objeto domicilio
            while (keys.next()){
                domicilio.setId(keys.getInt(1));
            }
            //cierro la stament
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
        return domicilio;
    }

    @Override
    public void delete(int matricula) {
        Connection connection = null;
        //3 preparar la consulta
        String ls_sql = "DELETE FROM odontologos WHERE matricula=?";
        try{
            //abro conexion
            connection = getConnection();
            //3 preparar la sentencia
            PreparedStatement psSelect = connection.prepareStatement(ls_sql);
            psSelect.setInt(1,matricula);
            //4 ejecutar la sentencia
            psSelect.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                //cierro conexion
                connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public Domicilio findEmail(String email) {
        return null;
    }
}
