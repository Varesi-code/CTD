package Clase5.M5;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Tana", "tanacin");
        System.out.println(usuario.getNombre() + " esta en el nivel " + usuario.getNivel() + " y tiene "+ usuario.getPuntaje() + " puntos");
        usuario.subirNivel();
        usuario.aumentarPuntaje();
        usuario.bonus(5);
        System.out.println(usuario.getNombre() + " esta en el nivel " + usuario.getNivel() + " y tiene "+ usuario.getPuntaje() + " puntos");
    }
}
