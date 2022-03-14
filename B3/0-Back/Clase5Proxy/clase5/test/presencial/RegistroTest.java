package presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {
    @Test
    public void vacunarPersonaBien(){
        //dado
        Persona persona= new Persona("Rodolfo","Baspineiro","37636983","Pfizer",new Date(2022-1900,3-1,1));
        Registro registro= new RegistroVacunaProxy();
        String respuestaEsperada="Se ha registrado el DNI 37636983 como persona vacunada con Pfizer";
        //cuando
        String respuesta=registro.vacunar(persona);
        //entonces
        Assertions.assertEquals(respuestaEsperada,respuesta);
    }
    @Test
    public void vacunarPersonaMal(){
        //dado
        Persona persona= new Persona("Rodolfo","Baspineiro","37636983","Pfizer",new Date(2022-1900,3-1,5));
        Registro registro= new RegistroVacunaProxy();
        String respuestaEsperada="Vuelva cuando sea su turno. :D";
        //cuando
        String respuesta=registro.vacunar(persona);
        //entonces
        Assertions.assertEquals(respuestaEsperada,respuesta);
    }
}