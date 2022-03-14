package presencial;

import java.util.HashMap;

public class FlyweightFactory {
    // guardar los triangulos creados
    // method factory
    public static final HashMap<String, Triangulo> trianguloMap=new HashMap<>();

    public static Triangulo getTriangulo(String color){
        //String clave="clave=["+color+"]";
        if (!trianguloMap.containsKey(color)){
            trianguloMap.put(color,new Triangulo(color));
            System.out.println("Triangulo creado de color: "+color);
            return trianguloMap.get(color);
        }
        System.out.println("Triangulo recuperado de color: "+color);
        return trianguloMap.get(color);

    }
}
