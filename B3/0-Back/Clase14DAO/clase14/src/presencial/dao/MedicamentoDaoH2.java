package presencial.dao;

import presencial.modelo.Medicamento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MedicamentoDaoH2 implements IDao<Medicamento>{
    @Override
    public Medicamento guardar(Medicamento medicamento) {
        Connection connection=null;
        try{
            //conectarnos a la base
            connection=getConnection();
            //preprar la operacion
            PreparedStatement preparedStatement= connection.prepareStatement("INSERT INTO medicamentos (nombre, laboratorio, cantidad, precio, codigo_numero) VALUES (?,?,?,?,?)");
            preparedStatement.setString(1,medicamento.getNombre());
            preparedStatement.setString(2,medicamento.getLaboratorio());
            preparedStatement.setInt(3,medicamento.getCantidad());
            preparedStatement.setDouble(4,medicamento.getPrecio());
            preparedStatement.setInt(5,medicamento.getCodigoNumero());
            //ejecutar
            preparedStatement.executeUpdate();
            //loggear
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            }catch (SQLException t){
                t.printStackTrace();
            }
        }
        return medicamento;
    }

    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/clase14","sa","");
    }
}
