package presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeDescuentoTest {
    @Test
    public void descuento30(){
        //dado
        FacadeDescuento facade= new FacadeDescuento();
        Tarjeta tarj= new Tarjeta("5458758458275","Star Bank");
        Producto m1= new Producto("Arvejas en lata","Latas");
        int cantidad=5;
        int descuentoEsperado=30;
        //cuando
        int descuentoCalculado=facade.descuento(tarj,m1,cantidad);
        //entonces
        Assertions.assertEquals(descuentoEsperado,descuentoCalculado);
    }

    @Test
    public void descuento10(){
        //dado
        FacadeDescuento facade= new FacadeDescuento();
        Tarjeta tarj= new Tarjeta("5458758458275","Luna Bank");
        Producto m1= new Producto("Arvejas en lata","Latas");
        int cantidad=5;
        int descuentoEsperado=10;
        //cuando
        int descuentoCalculado=facade.descuento(tarj,m1,cantidad);
        //entonces
        Assertions.assertEquals(descuentoEsperado,descuentoCalculado);
    }
}