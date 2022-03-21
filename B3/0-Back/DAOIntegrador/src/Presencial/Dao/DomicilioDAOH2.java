package Presencial.Dao;

import Presencial.DB;
import Presencial.modelo.Domicilio;
import Presencial.modelo.Paciente;

import java.sql.*;

public class DomicilioDAOH2 implements IDao <Domicilio>{
    @Override
    public Domicilio insert(Domicilio domicilio) {
        Connection connection = null;
        String ls_sql = "INSERT INTO DOMICILIOS(" +
                "CALLE,NUMERO,LOCALIDAD,PROVINCIA)" +
                "VALUES(?,?,?,?)";

        try{
            //abro conexion
            connection = DB.getConnection();

            //creo statement
            PreparedStatement psInsert = connection.prepareStatement(ls_sql,Statement.RETURN_GENERATED_KEYS);
            psInsert.setString(1,domicilio.getCalle());
            psInsert.setInt(2,domicilio.getNumero());
            psInsert.setString(3,domicilio.getLocalidad());
            psInsert.setString(4,domicilio.getProvincia());
            psInsert.executeUpdate();

            //busco Id generado
            ResultSet rs = psInsert.getGeneratedKeys();
            if(rs.next()){
                domicilio.setId(rs.getInt(1));
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

        return domicilio;
    }

    @Override
    public Domicilio update(Domicilio domicilio) {
        Connection connection = null;
        String ls_sql = "UPDATE DOMICILIOS SET CALLE=?,NUMERO=?,LOCALIDAD=?,PROVINCIA=? WHERE ID=?";

        try{
            //abro conexion
            connection = DB.getConnection();

            //creo statement
            PreparedStatement psUpdate = connection.prepareStatement(ls_sql);
            psUpdate.setString(1,domicilio.getCalle());
            psUpdate.setInt(2,domicilio.getNumero());
            psUpdate.setString(3,domicilio.getLocalidad());
            psUpdate.setString(4,domicilio.getProvincia());
            psUpdate.setInt(5,domicilio.getId());
            psUpdate.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }

        return domicilio;
    }



    @Override
    public Domicilio select(int id) {
        Connection connection = null;
        String ls_sql = "SELECT * FROM DOMICILIOS WHERE ID=?";
        Domicilio domicilio = null;

        try{
            //abro conexion
            connection = DB.getConnection();


            //creo statement
            PreparedStatement psSelect = connection.prepareStatement(ls_sql);
            psSelect.setInt(1,id);

            ResultSet rs = psSelect.executeQuery();
            if(rs.next()){
                domicilio = new Domicilio(rs.getString("Calle"),rs.getString("Localidad"),rs.getString("Provincia"),
                        rs.getInt("Numero"),rs.getInt("id"));
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

        return domicilio;
    }



    @Override
    public String delete(int id) {
        Connection connection = null;
        String ls_sql = "DELETE FROM DOMICILIOS WHERE ID=?";
        String msj = "No se pudo eliminar!";

        try{
            //abro conexion
            connection = DB.getConnection();

            //creo statement
            PreparedStatement psSelect = connection.prepareStatement(ls_sql);
            psSelect.setInt(1,id);

            if( psSelect.execute()){
                msj = "Domicilio eliminado con exito!";
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
