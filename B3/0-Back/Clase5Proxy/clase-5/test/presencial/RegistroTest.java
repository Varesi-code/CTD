package presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {

    @Test
    public void vacunarPersonaBien(){
        //dado
        Persona persona = new Persona("Rodolfo", "Baspineiro", "45617697","Pfizer",new Date(2022-1900,3-1,1));
        Registro registro = new RegistroVacunaProxy();
        String respuestaEsperada = "Se ha registrado el DNI 45617697 como persona vacunada con Pfizer";
        //cuando
        String respuesta =  registro.vacunar(persona);
        //entonces
        Assertions.assertEquals(respuestaEsperada, respuesta);
    }
}