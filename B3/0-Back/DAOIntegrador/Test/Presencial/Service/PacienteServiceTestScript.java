package Presencial.Service;

import Presencial.Dao.PacienteDAOH2;
import Presencial.modelo.Domicilio;
import Presencial.modelo.Paciente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PacienteServiceTestScript {
    @BeforeAll
    public static void cargarBD(){
        Connection connection = null;
        //cargar el driver y obtener la conexion
        try {
            Class.forName("org.h2.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:h2:~/clase15;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }}

    @Test
    public void testGuardarPaciente(){
        //dado
        Domicilio domicilio = new Domicilio("Calle 3", "Ciudad 3", "Provincia 3", 5476);
        Paciente pacienteParaAgregar = new Paciente("Pedro", "Tapia",domicilio, LocalDate.of(1990,10,10), 234);
        PacienteService pacienteService = new PacienteService(new PacienteDAOH2());
        Paciente pacienteResultado;
        int resultadoEsperado = 3;

        //cuando
        pacienteService.insert(pacienteParaAgregar);
        pacienteResultado = pacienteService.select(resultadoEsperado);

        //entonces
        Assertions.assertEquals(resultadoEsperado, pacienteResultado.getId());

    }

}