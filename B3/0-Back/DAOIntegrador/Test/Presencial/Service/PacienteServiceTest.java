package Presencial.Service;

import Presencial.DB;
import Presencial.Dao.PacienteDAOH2;
import Presencial.modelo.Domicilio;
import Presencial.modelo.Paciente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PacienteServiceTest {

    @Test
    public void testPacienteService(){

        try{
            PacienteService pacienteService = new PacienteService(new PacienteDAOH2());

            DB.CrearDB();

            Domicilio domicilio1 = new Domicilio("Las catalpas","Jauregui","Buenos Aires",705);
            Paciente paciente1 = new Paciente("Nicolas","Gutierrez",domicilio1, LocalDate.of(2022,3,16),12456378);
            pacienteService.insert(paciente1);

            Domicilio domicilio2 = new Domicilio("Mitre","Lujan","Buenos Aires",1058);
            Paciente paciente2 = new Paciente("Lucas","Lopez",domicilio2, LocalDate.of(2021,5,19),79846512);
            pacienteService.insert(paciente2);

            Domicilio domicilio3 = new Domicilio("San Martin","Gualmayen","Mendoza",052);
            Paciente paciente3 = new Paciente("Felipe","Garcia",domicilio3, LocalDate.of(2020,7,28),18796359);
            pacienteService.insert(paciente3);

            //busco pacientes y mustro
            Paciente pacienteBuscado1 = pacienteService.select(1);
            System.out.println(pacienteBuscado1.toString());
            Paciente pacienteBuscado2 = pacienteService.select(2);
            System.out.println(pacienteBuscado2.toString());
            Paciente pacienteBuscado3 = pacienteService.select(3);
            System.out.println(pacienteBuscado3.toString());

            //hago test
            Assertions.assertEquals(paciente2.toString(),pacienteBuscado2.toString());

            //elimino
        pacienteService.delete(1);

            Paciente pacienteEliminado = pacienteService.select(1);
            Assertions.assertEquals(pacienteEliminado,null);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}