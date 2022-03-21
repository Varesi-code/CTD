package presencial.dao;

import presencial.modelo.Domicilio;

import java.sql.*;

public class DomicilioDAOH2 implements IDao<Domicilio> {
    @Override
    public Domicilio guardar(Domicilio domicilio) {
        //conectarnos
        Connection connection=null;
        try{
            //preparar la info para insertar
            connection=getConnection();
            PreparedStatement preparedStatement= connection.prepareStatement("INSERT INTO domicilios (calle, numero, localidad, provincia) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,domicilio.getCalle());
            preparedStatement.setInt(2,domicilio.getNumero());
            preparedStatement.setString(3,domicilio.getLocalidad());
            preparedStatement.setString(4, domicilio.getProvincia());

            //ejecutar
            preparedStatement.executeUpdate();

            //busquemos el id generado
            ResultSet rs=preparedStatement.getGeneratedKeys();
            while (rs.next()){
                domicilio.setId(rs.getInt(1));
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
    public Domicilio buscar(int id) {
        Connection connection=null;
        return null;

    }

    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/clase15","sa","sa");

    }
}
