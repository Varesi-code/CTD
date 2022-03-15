package mesa.dao;

import mesa.modelo.Medicamento;

import java.sql.Connection;

public class MedicamentoDaoH2 implements Dao<Medicamento>{


    private static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return java.sql.DriverManager.getConnection("jdbc:h2:~/clase14", "sa", "");
    }

    @Override
    public void guardar(Medicamento medicamento) {
        try {
            Connection connection = getConnection();
            connection.createStatement().executeUpdate("INSERT INTO medicamento (nombre, precio) VALUES ('" + medicamento.getNombre() + "', " + medicamento.getPrecio() + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
