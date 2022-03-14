package presencial;

public class Programa {
    public static void main(String[] args) throws Exception {
        App aplicacion = new App();
        aplicacion.agregarEntero(54);
        try {
            aplicacion.agregarEntero(81);
            aplicacion.agregarEntero(85);
            aplicacion.agregarEntero(12);
            aplicacion.agregarEntero(2);
            aplicacion.agregarEntero(22);
            aplicacion.maximoYMinimo();
            aplicacion.promedio();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
