package Mesa;

import java.sql.*;

public class Main {
    private static final String SQL_CREATE_TABLE= "DROP TABLE IF EXISTS ODONTOLOGOS;"
            + "CREATE TABLE ODONTOLOGOS ("
            + "NOMBRE VARCHAR(25) NOT NULL,"
            + "APELLIDO VARCHAR(25) NOT NULL,"
            + "MATRICULA VARCHAR(25) NOT NULL,"
            + ");";

    private static final String SQL_INSERT = "INSERT INTO ODONTOLOGOS (NOMBRE, APELLIDO, MATRICULA)"
            + " VALUES (?,?,?);";
    
    private static final String SQL_SELECT = "SELECT * FROM ODONTOLOGOS;";
    
    private static final String SQL_UPDATE = "UPDATE ODONTOLOGOS SET NOMBRE = 'Megan', APELLIDO = 'Radford', MATRICULA = 1234ff WHERE MATRICULA = ?;";
    
    public void main (String[] args) {
        Odontologos odontologos = new Odontologos("Marta", "Gomez", "4444ff");
        Connection connection = null;
        try {
            connection = getConnection();
        
    }

    
    }

    public static Connection getConnection() throws Exception {


    }

}
