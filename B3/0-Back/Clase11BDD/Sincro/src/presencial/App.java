package presencial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    private static final String SQL_CREATE_TABLE="DROP TABLE IF EXISTS USUARIO; " +
    "CREATE TABLE USUARIO(" +
    " ID INT PRIMARY KEY," +
    " PRIMER_NOMBRE VARCHAR(50) NOT NULL," +
    " APELLIDO VARCHAR(50) NOT NULL," +
    " EDAD INT NOT NULL" +
    " )";
    private static final String SQL_INSERT1="INSERT INTO USUARIO(ID,PRIMER_NOMBRE, APELLIDO, EDAD) VALUES(1,'Juan', 'Perez', 25)";
    private static final String SQL_INSERT2="INSERT INTO USUARIO(ID,PRIMER_NOMBRE, APELLIDO, EDAD) VALUES(2,'Maria', 'Gonzalez', 20)";

    private static final String SQL_SELECT1="SELECT * FROM USUARIO";

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

    }
    public static void main(String[] args) throws Exception{
        Connection connection=null;
        try {
            connection=getConnection();
            Statement statement=connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
            statement.execute(SQL_INSERT1);
            Statement statement2=connection.createStatement();
            statement.execute(SQL_INSERT2);

            ResultSet resultSet=statement.executeQuery(SQL_SELECT1);
            while(resultSet.next()){
                System.out.println("ID: "+resultSet.getInt("ID")+" Nombre: "+resultSet.getString("PRIMER_NOMBRE")+" Apellido: "+resultSet.getString("APELLIDO")+" Edad: "+resultSet.getInt("EDAD"));
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            connection.close();
        }
    }
}
