package presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightFactoryTest {
    @Test
    public void trianguloVerde(){
        //dado
        Triangulo t1= FlyweightFactory.getTriangulo("verde");
        t1.setTamanio(2);
        Triangulo t2= FlyweightFactory.getTriangulo("verde");
        t2.setTamanio(4);
        int respEsperada=1;
        int respEsperadaT1=4;
        int respEsperadaT2=4;
        //cuando

        //entonces
        Assertions.assertEquals(respEsperada,FlyweightFactory.trianguloMap.size());
        Assertions.assertEquals(respEsperadaT1,t1.getTamanio());
        Assertions.assertEquals(respEsperadaT2,t2.getTamanio());
    }

}