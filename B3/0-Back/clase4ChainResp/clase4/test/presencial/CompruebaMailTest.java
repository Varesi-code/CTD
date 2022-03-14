package presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompruebaMailTest {
    @Test
    public void deberiaSerComercial(){
        //dado
        CompruebaMail proceso= new CompruebaMail();
        Mail elCorreo= new Mail("rodolfo@gmail.com","comercial@colmena.com","Ayuda de comercial");
        String respEsperada="Enviando a comercial";
        //cuando
        //String resultado=proceso.comprobar(elCorreo);
        String resultado=proceso.getInicial().comprobar(elCorreo);
        //entonces
        Assertions.assertEquals(respEsperada,resultado);
    }
    @Test
    public void deberiaSerSpam(){
        //dado
        CompruebaMail proceso= new CompruebaMail();
        Mail elCorreo= new Mail("rodolfo@gmail.com","comercial2@colmena.com","Ayuda de comercial");
        String respEsperada="Enviando a comercial";
        //cuando
        String resultado=proceso.comprobar(elCorreo);
        //entonces
        Assertions.assertEquals(respEsperada,resultado);
    }
}