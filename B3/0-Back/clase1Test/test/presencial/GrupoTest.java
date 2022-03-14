package presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    @Test
    public void controlAltaGrupo(){
        //dado
        Persona juan= new Persona("Juan",25);
        Persona pedro= new Persona("Pedro",19);
        Persona ana= new Persona("Ana",35);
        Persona luz= new Persona("Luz",15);
        Persona julian= new Persona("Julián",20);
        Grupo grupo = new Grupo();
        //cuando
        grupo.agregarPersona(juan);
        grupo.agregarPersona(pedro);
        grupo.agregarPersona(ana);
        grupo.agregarPersona(luz);
        grupo.agregarPersona(julian);
        //entonces
        Assertions.assertTrue(grupo.getPersonasEnElGrupo()==2);

        //Math.
    }
}