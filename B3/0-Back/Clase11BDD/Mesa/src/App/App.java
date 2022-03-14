package App;

public class App {
    private static final String SQL_CREATE_TABLE= "DROP TABLE IF EXISTS EMPLEADO; " +
            "CREATE TABLE USUARIO(" +
            " ID INT PRIMARY KEY," +
            " PRIMER_NOMBRE VARCHAR(50) NOT NULL," +
            " APELLIDO VARCHAR(50) NOT NULL," +
            " EDAD INT NOT NULL" +
            " UBICACION VARCHAR(50) NOT NULL" +
            " )";
    private static final String SQL_INSERT1= "INSERT INTO EMPLEADO VALUES(1,'Carmen','Rodriguez','22','Calle 1')";
    private static final String SQL_INSERT2 = "INSERT INTO EMPLEADO VALUES(1,'Tana','Ferro','34','Calle 2')";
    private static final String SQL_INSERT3 = "INSERT INTO EMPLEADO VALUES(3,'Nati','Melicoso','17','Calle 3')";

    private static final String SQL_SELECT = "SELECT * FROM EMPLEADO";




}
