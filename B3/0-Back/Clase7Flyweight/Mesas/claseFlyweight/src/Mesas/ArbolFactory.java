package Mesas;

import presencial.Computadora;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {

    private static Map<String, Arbol> bosque= new HashMap<>();
    public Arbol getArbol(String tipo, String color, int alto, int ancho) {

        String clave = "key:" + tipo + " : " + color + " : " + alto + " : " + ancho;
        System.out.println(clave);
        if (!bosque.containsKey(clave)){
            bosque.put(clave,new Arbol(tipo, color, alto, ancho));
            System.out.println("Arbol creado");
            return bosque.get(clave);
        }
        System.out.println("Arbol recuperado");
        return bosque.get(clave);
    }
}
