package presencial.servicio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import presencial.dao.PacienteDAOH2;
import presencial.modelo.Domicilio;
import presencial.modelo.Paciente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PacienteServiceTest {
    @BeforeAll
    public static void cargarBD(){
        Connection connection=null;
        //intentar conectarme a la base
        try{
            Class.forName("org.h2.Driver").newInstance();
            connection= DriverManager.getConnection("jdbc:h2:~/clase15;INIT=RUNSCRIPT FROM 'create.sql'","sa","sa");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (SQLException ex){
                ex.printStackTrace();
            }
        }

    }
    @Test
    public void prueba_guardar_buscar_paciente(){
        //dado
            Domicilio domicilio= new Domicilio("Calle C",8748,"Cafayate","Salta");
            Paciente pacienteParaAgregar= new Paciente("Tapia","Pedro",7485, LocalDate.of(2022,3,10),domicilio);
            PacienteService pacienteService= new PacienteService(new PacienteDAOH2());
            Paciente pacienteResultado;
            int resultadoEsperado=3;
        //cuando
            pacienteService.guardar(pacienteParaAgregar);
            pacienteResultado=pacienteService.buscar(resultadoEsperado);
        //entonces
        Assertions.assertEquals(resultadoEsperado,pacienteResultado.getId());
    }
}