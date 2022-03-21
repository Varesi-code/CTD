package Presencial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB {
    private static final String SQL_CREATE_TABLE="DROP TABLE IF EXISTS DOMICILIOS;" +
            "CREATE TABLE DOMICILIOS(" +
            "ID INT AUTO_INCREMENT PRIMARY KEY," +
            "CALLE VARCHAR(150) NOT NULL," +
            "LOCALIDAD VARCHAR(100) NOT NULL," +
            "NUMERO INT," +
            "PROVINCIA VARCHAR(100) NOT NULL);"+
            "DROP TABLE IF EXISTS PACIENTES;" +
            "CREATE TABLE PACIENTES(" +
            "ID INT AUTO_INCREMENT NOT NULL," +
            "NOMBRE VARCHAR(100) NOT NULL," +
            "APELLIDO VARCHAR(100) NOT NULL," +
            "DOMICILIO_ID INT NOT NULL," +
            "FECHA_INGRESO DATE NOT NULL," +
            "DNI INT NOT NULL)";

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").getNestHost();
        return DriverManager.getConnection("jdbc:h2:~/clase15","sa","sa");
    }

    public static void CrearDB() throws Exception{
        Connection connection = null;

        try {
            Class.forName("org.h2.Driver").newInstance();
            connection= DriverManager.getConnection("jdbc:h2:~/clase15","sa","sa");

            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
        }
    }
}
