package Mesa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RopaFactoryTest {
    @Test
    public void ropaTest(){
        Ropa r1 = RopaFactory.getRopa("XS", "pantalon",true, true);
        Ropa r2 = RopaFactory.getRopa("L", "remera", false, false);
        Ropa r3 = RopaFactory.getRopa("XS", "pantalon",true, true);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }
    @Test
    public void FactoryTest(){
        Ropa r1 = RopaFactory.getRopa("M", "camisa",true, true);
        Ropa r2 = RopaFactory.getRopa("XL", "trench", true, false);
        Ropa r3 = RopaFactory.getRopa("L", "pantalon",true, false);

        int respEsperada = 2;
        Assertions.assertEquals(respEsperada, RopaFactory.lista.size());
    }

}