package presencial.dao;

import presencial.modelo.Domicilio;
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
        Connection connection= null;
        Paciente paciente=null;
        Domicilio domicilio;
        try{
            DomicilioDAOH2 domicilioDAOH2= new DomicilioDAOH2();

            connection=getConnection();
            PreparedStatement preparedStatement2= connection.prepareStatement("SELECT * FROM pacientes WHERE ID=?");
            preparedStatement2.setInt(1, id);
            ResultSet rs= preparedStatement2.executeQuery();
            while (rs.next()) {
                int id_dom=rs.getInt(6);
                domicilio=domicilioDAOH2.buscar(id_dom);
                paciente= new Paciente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5).toLocalDate(),domicilio);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            }
            catch (SQLException t){
                t.printStackTrace();
            }
        }
        return paciente;
    }

    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/clase15","sa","sa");
    }
}
