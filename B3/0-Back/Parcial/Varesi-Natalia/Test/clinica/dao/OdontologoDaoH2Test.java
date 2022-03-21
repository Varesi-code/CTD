package clinica.dao;

import clinica.modelo.Odontologo;
import clinica.service.OdontologoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 class OdontologoDaoH2Test  {
    @BeforeAll
    public static void cargarBD() {
        Connection connection = null;
        //Cargar el driver y abrir la conexion
        try {
            Class.forName("org.h2.Driver").newInstance();
            //Conexion a la base de datos y creacion de la tabla
            connection = DriverManager.getConnection("jdbc:h2:~/parcial;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "sa");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Test
    public void testListAll() {
        //dado
        Odontologo odontologo1=new Odontologo(4213,"Juan","Perez");
        Odontologo odontologo2=new Odontologo(6578,"Maria","Gonzalez");
        Odontologo odontologo3=new Odontologo(1234,"Pedro","Lopez");
        OdontologoService odontologoService=new OdontologoService(new OdontologoDaoH2());

        odontologoService.agregarOdontologo(odontologo1);
        odontologoService.agregarOdontologo(odontologo2);
        odontologoService.agregarOdontologo(odontologo3);

        int resultadoEsperado=3;
        int resultadoReal=0;

        //cuando
        resultadoReal=odontologoService.todos().size();
        System.out.println(resultadoReal);

        //entonces
        Assertions.assertEquals(resultadoEsperado,resultadoReal);
    }
    }
