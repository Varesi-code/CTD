package presencial.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BD {
    //statement
    private final static String SQL_CREATE_TABLE="DROP TABLE IF EXISTS medicamentos;"
            +" CREATE TABLE medicamentos (ID INT AUTO_INCREMENT PRIMARY KEY, "
            +" NOMBRE varchar(100),"
            +" LABORATORIO varchar(100),"
            +" CANTIDAD INT,"
            +" PRECIO DOUBLE,"
            +" CODIGO_NUMERO INT)";

    //preparedStatement
    //private final static String SQL_INSERT_MEDICAMENTO="INSERT INTO medicamentos(NOMBRE,LABORATORIO,CANTIDAD,PRECIO,CODIGO_NUMERO) VALUES(?,?,?,?,?)";
    //try (PreparedStatement pstmt = connection.prepareStatement(query)) {
    //
    //pstmt.setString(1, medicamento.getNombre());
    //pstmt.setString(2, medicamento.getLaboratorio());
    //etc
    //pstmt.executeUpdate();
    //
    //}
    //catch (SQLException ex) {
    //
    //}

    public static void crearBD() {
        Connection connection=null;
        try{
            //1
            connection=getConnection();

            //3 ejecutar la consulta
            Statement statement= connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                //4 cerrar la conexion
                connection.close();

            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    //1
    public static Connection getConnection() throws Exception{
        //1 cargar el driver
        Class.forName("org.h2.Driver").newInstance();
        //2 obtener la conexion
        return DriverManager.getConnection("jdbc:h2:~/nombreTabla", "sa", "");
    }
}

