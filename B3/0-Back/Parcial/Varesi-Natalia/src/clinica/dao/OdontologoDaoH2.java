package clinica.dao;

import clinica.modelo.*;
import org.apache.log4j.Logger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDaoH2 implements IDao<Odontologo> {
    private static final Logger logger= Logger.getLogger(OdontologoDaoH2.class);

    //////////////////// Insertar //////////////////////
    @Override
    public Odontologo insert(Odontologo odontologo) {
        Connection connection = null;
        //3 preparar la consulta
        String sql = "INSERT INTO odontologos (matricula, nombre, apellido) VALUES (?, ?, ?)";
        try {
            //1 cargar el driver y 2 obtener la conexion
            connection = getConnection();
            //loggear la conexion
            logger.info("Conexion establecida.");
            //3 preparar la sentencia
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, odontologo.getMatricula());
            statement.setString(2, odontologo.getNombre());
            statement.setString(3, odontologo.getApellido());
            if (odontologo.getMatricula() == 0 || odontologo.getNombre() ==" " || odontologo.getApellido() ==" ") {
                logger.error("No se pudo insertar el odontólogo. Verifique los datos e intente nuevamente.");
            }else {
                //4 ejecutar update
                statement.executeUpdate();
                //loggear la ejecucion
                logger.info("Odontólogo insertado en la base de datos");
            }
        } catch (Exception e) {
            logger.error( "Error al insertar odontólogo.", e);

        } finally {
            try {
                //5 cerrar la conexion
                connection.close();
            } catch (Exception e) {
                logger.error(e);
            }
        }
        return odontologo;
    }

    //////////////////// buscar //////////////////////
    @Override
    public Odontologo find(int matricula) {
        Connection connection= null;
        Odontologo odontologo=null;

        try {
            //1 cargar el driver y 2 obtener la conexion
            connection = getConnection();
            //loggear la conexion
            logger.info("Conexion establecida.");
            //3 preparar la consulta
            PreparedStatement preparedStatement2 = connection.prepareStatement("SELECT * FROM odontologos WHERE matricula=?");
            preparedStatement2.setInt(1, matricula);
            if (matricula == 0) {
                logger.error("No se pudo buscar el odontólogo. Verifique los datos e intente nuevamente.");
            } else {
                //4 ejecutar la consulta
                ResultSet rs = preparedStatement2.executeQuery();
                //5 obtener el resultado
                while (rs.next()) {
                    int matriculaOdontologo = rs.getInt("matricula");
                    String nombreOdontologo = rs.getString("nombre");
                    String apellidoOdontologo = rs.getString("apellido");
                    odontologo = new Odontologo(matriculaOdontologo, nombreOdontologo, apellidoOdontologo);
                    odontologo.setMatricula(matriculaOdontologo);
                    odontologo.setNombre(nombreOdontologo);
                    odontologo.setApellido(apellidoOdontologo);
                }
                //loggear la ejecucion
                logger.info("Odontólogo encontrado en la base de datos");
            }
        } catch (Exception e) {
            logger.error("No se pudo buscar el odontólogo.",e);
        } finally {
            try {
                //5 cerrar la conexion
                connection.close();
            } catch (Exception e) {
                logger.error(e);
            }
        }
        return odontologo;
    }

    //////////////////// actualizar //////////////////////
    @Override
    public Odontologo update(Odontologo odontologo) {
        Connection connection = null;
        try{
            //1 cargar el driver y 2 obtener la conexion
            connection = getConnection();
            //loggear la conexion
            logger.info("Conexion establecida.");
            //3 preparar la consulta
            String sql = "UPDATE odontologos SET nombre = ?, apellido = ? WHERE matricula = ?";
            //3 preparar la sentencia
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, odontologo.getMatricula());
            statement.setString(2, odontologo.getNombre());
            statement.setString(3, odontologo.getApellido());
            //4 ejecutar update
            statement.executeUpdate();
            //loggear la ejecucion
            logger.info("Odontólogo actualizado en la base de datos");
        } catch (Exception e) {
            logger.error("No se pudo actualizar el odontólogo.",e);
        } finally {
            try {
                //5 cerrar la conexion
                connection.close();
            }catch (SQLException e) {
                logger.warn(e);
            }
        }return odontologo;
    }

    //////////////////// eliminar //////////////////////
    @Override
    public void delete(int matricula) {
        Connection connection = null;
        //3 preparar la consulta
        String ls_sql = "DELETE FROM odontologos WHERE matricula=?";
        try{
            //abro conexion
            connection = getConnection();
            //loguear conexion
            logger.info("Conexion establecida.");

            //3 preparar la sentencia
            PreparedStatement psSelect = connection.prepareStatement(ls_sql);
            psSelect.setInt(1,matricula);
            //4 ejecutar la sentencia
            psSelect.executeUpdate();
            //loguear ejecucion
            logger.info("Odontólogo eliminado de la base de datos");
        }catch (Exception e){
            logger.error("No se pudo eliminar el odontólogo.",e);
        }finally {
            try{
                //cierro conexion
                connection.close();
            }catch (Exception e){
                logger.warn(e);
            }
        }
    }

    //////////////////// listar todos //////////////////////
    @Override
    public List<Odontologo> listAll() {
        Connection connection = null;
        List<Odontologo> odontologos = new ArrayList<>();
        //loguear creacion de lista
        logger.info("Creando lista de odontólogos.");
        try{
            //1 cargar el driver y 2 obtener la conexion
            connection = getConnection();
            //loggear la conexion
            logger.info("Conexion establecida.");
            //3 preparar la consulta
            String sql = "SELECT * FROM odontologos";
            PreparedStatement statement = connection.prepareStatement(sql);

            //4 ejecutar la consulta
            ResultSet resultSet = statement.executeQuery();
            //loggear la ejecucion
            logger.info("Consulta ejecutada.");

            //5 procesar el resultado
            while (resultSet.next()) {
                int matriculaOdontologo = resultSet.getInt("matricula");
                String nombreOdontologo = resultSet.getString("nombre");
                String apellidoOdontologo = resultSet.getString("apellido");
                Odontologo odontologo = new Odontologo(matriculaOdontologo, nombreOdontologo, apellidoOdontologo);
                //agregar a la lista
                odontologos.add(odontologo);
            }
            //loggear la ejecucion
            logger.info("Lista de odontólogos obtenida.");
            System.out.println(odontologos);

        } catch (Exception e) {
            logger.error("No se pudo obtener la lista de odontólogos.",e);
        }   finally {
            if (connection != null) {
                try {
                    //5 cerrar la conexion
                    connection.close();
                }
                catch (SQLException e) {
                    logger.warn(e);
                }
            }
        }
        return odontologos;
    }

    //1y2
    public static Connection getConnection () throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/parcial", "sa", "sa");
    }
}