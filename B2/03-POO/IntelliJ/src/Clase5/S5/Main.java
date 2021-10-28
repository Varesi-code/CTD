package Clase5.S5;

public class Main {
    public static void main(String[] args) {
        S5 cliente = new S5( 145,"Jose");
        cliente.incrementarDeuda(100.23);
        System.out.println("Deuda: " + cliente.getDeuda());
        cliente.pagarDeuda();
        System.out.println("Gracias. Ahora tu deuda esta en "+cliente.getDeuda());

    }
}
