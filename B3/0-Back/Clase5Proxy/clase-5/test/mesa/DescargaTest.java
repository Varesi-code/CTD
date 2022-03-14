package mesa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescargaTest {
    @Test
    public void descargaConPremium(){
        //dado
        Usuario usuario1 = new Usuario(true, "12345");
        Descarga descarga = new ServicioDescargaProxy();
        String respuestaEsperada = "Se registro el usuario 12345 como usuario premium";
        //cuando
        String respuesta = descarga.descarga(usuario1);
        //entonces
        Assertions.assertEquals(respuestaEsperada, respuesta);
    }

    @Test
    public void descargaConFree(){
        //dado
        Usuario usuario1 = new Usuario(false, "12345");
        Descarga descarga = new ServicioDescargaProxy();
        String respuestaEsperada = "Hubo un error sos un usuario free";
        //cuando
        String respuesta = descarga.descarga(usuario1);
        //entonces
        Assertions.assertEquals(respuestaEsperada, respuesta);
    }


}