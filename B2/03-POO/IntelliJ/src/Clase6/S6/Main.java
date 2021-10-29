package Clase6.S6;

public class Main {
    public static void main(String[] args) {

        Impresora impresora = new Impresora("Epson 3456","USB");

        impresora.imprimir("Hola mundo");
        System.out.println(impresora.getCantidadHojas());
        impresora.agregarPapel();
        impresora.imprimir("Chau mundo");
        System.out.println(impresora.getCantidadHojas());

    }
}
