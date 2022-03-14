package Mesas;

import presencial.Computadora;
import presencial.ComputadoraFactory;

public class App {
    public static void main(String[] args){
        ArbolFactory arbol= new ArbolFactory();
        Arbol a1= arbol.getArbol("frutal","azul",200,300);
        Arbol a2= arbol.getArbol("Ornamental","rojo",100,400);
        Arbol a3= arbol.getArbol("frutal","negro",500,350);

        System.out.println(a1.toString());
        System.out.println(a2);
        System.out.println(a3);

    for (int i=0; i<=100; i++){
        arbol.getArbol("Frutal","celeste",100,200);

        }
    }
}
