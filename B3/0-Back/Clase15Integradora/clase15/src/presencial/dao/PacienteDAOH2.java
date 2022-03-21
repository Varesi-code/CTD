package presencial.dao;

import presencial.modelo.Paciente;

import java.sql.*;

public class PacienteDAOH2 implements IDao<Paciente>{
    @Override
    public Paciente guardar(Paciente paciente) {
        //conectarnos
        Connection connection=null;
        try{
            //guardar el domicilio
            DomicilioDAOH2 domicilioDAOH2=new DomicilioDAOH2();
            domicilioDAOH2.guardar(paciente.getDomicilio());
            //preparar la info para insertar
            connection=getConnection();
            PreparedStatement preparedStatement= connection.prepareStatement("INSERT INTO pacientes (apellido, nombre, dni, fecha_ingreso, domicilio_id) VALUES (?,?,?,?,?)");
            preparedStatement.setString(1,paciente.getApellido());
            preparedStatement.setString(2,paciente.getNombre());
            preparedStatement.setInt(3,paciente.getDni());
            preparedStatement.setDate(4, Date.valueOf(paciente.getFechaIngreso()));
            preparedStatement.setInt(5,paciente.getDomicilio().getId());

            //ejecutar
            preparedStatement.executeUpdate();
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
    public Paciente buscar(int id) {
        return null;
    }

    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/clase15","sa","sa");
    }
}
