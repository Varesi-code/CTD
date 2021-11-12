package Clase10.C10;

public class Main {
    public static void main(String[] args) {

        Socio[] losSocios = new Socio[2];
        losSocios[0] = new SocioHabilitado("23-55", "Juan Perez", 100.50, "Yoga", 200.50, true);
        losSocios[1] = new Socio("23-56", "Carlitos Perez", 100.50, "Crossfit");

        for (Socio s : losSocios) {
            System.out.println(s);
            System.out.println(s.costoMensual());
        }
    }
}
