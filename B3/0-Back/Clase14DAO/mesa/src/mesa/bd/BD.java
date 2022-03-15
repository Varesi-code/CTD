package mesa.bd;

public class BD {
    private final static String SQL_CREATE_TABLE= "DROP TABLE IF EXISTS medicamentos;"
            + "CREATE TABLE medicamentos (ID INT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(100), LABORATORIO VARCHAR(100), PRECIO DOUBLE, CANTIDAD INT, CODIGO_NUMERO INT);";


}
