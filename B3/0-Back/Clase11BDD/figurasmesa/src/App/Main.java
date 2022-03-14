package App;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    //creo conexion
    public static Connection getConnection() throws Exception {
        try{
            Class.forName("org.h2.Driver").newInstance();
            return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        }catch(Exception e){
            throw e;
        }

    }

    public static void main(String[] args) {

        String ls_sql = "";

        try {
            Connection H2Connection = getConnection();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            H2Connection.close();
        }
    }
    }