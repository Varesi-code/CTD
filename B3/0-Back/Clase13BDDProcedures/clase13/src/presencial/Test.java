package presencial;

import java.sql.*;

public class Test {
    private static final String SQL_CREATE_TABLE= "DROP TABLE IF EXISTS CUENTA;"
            +"CREATE TABLE CUENTA ("
            +" ID INT PRIMARY KEY,"
            +" NOMBRE varchar(100) NOT NULL,"
            +" NRO_CUENTA INT NOT NULL,"
            +" SALDO NUMERIC(10,2) NOT NULL"
            +" )";
    private static final String SQL_INSERT="INSERT INTO CUENTA (ID, NOMBRE, NRO_CUENTA, SALDO)"
            +" VALUES (?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE CUENTA SET SALDO=? WHERE ID=?";

    public static void main(String[] args) throws Exception{
        Cuenta cuenta = new Cuenta(1,22,"Cuenta de Rodolfo",20);
        Connection connection = null;
        try{
            connection=getConnection();
            //1 crear la tabla
            Statement statement= connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
            //2 cargar la fila
            PreparedStatement psInsert= connection.prepareStatement(SQL_INSERT);
            psInsert.setInt(1,cuenta.getId());
            psInsert.setString(2, cuenta.getNombre());
            psInsert.setInt(3,cuenta.getNroCuenta());
            psInsert.setDouble(4,cuenta.getSaldo());
            psInsert.executeUpdate();
            //3 update
            PreparedStatement psUpdate2=connection.prepareStatement(SQL_UPDATE);
            psUpdate2.setDouble(1,cuenta.getSaldo()+10);
            psUpdate2.setInt(2,cuenta.getId());
            psUpdate2.executeUpdate();
            //4 transacción update
            connection.setAutoCommit(false);
            PreparedStatement psUpdate3=connection.prepareStatement(SQL_UPDATE);
            psUpdate3.setDouble(1,cuenta.getSaldo()+25);
            psUpdate3.setInt(2,cuenta.getId());
            psUpdate3.executeUpdate();
            //int a=22/0;
            connection.commit();
            connection.setAutoCommit(true);
        }
        catch (Exception e){
            e.printStackTrace();
            if (connection!=null){
                try{
                    connection.rollback();
                }
                catch (SQLException ex){
                    ex.printStackTrace();
                }
            }
        }
        finally {
            connection.close();
        }
    }
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/clase14","sa","");
    }
}
