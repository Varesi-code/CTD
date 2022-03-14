package presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidadorTest {
    @Test
    public void emitirSueldoEMpleadoEfectivo() {

        //dado
        Liquidador liquidador = new LiquidadorEmpleadoEfectivo();
        Empleado empleado = new EmpleadoEfectivo("Martin", "Martini", "001A", 400, 40, 60);
        String respuestaEsperada = "La liquidacion generada es un documento digital.\nSaldo a liquidar: 420.0";
        //cuando
        String respuesta = liquidador.liquidarSueldo(empleado);
        //Entonces
        Assertions.assertEquals(respuestaEsperada, respuesta);
    }}