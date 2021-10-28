package Clase5.M5;

public class Usuario {
    private String nombre;
    private String clave;
    private int puntaje;
    private int nivel;

    public Usuario(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0;
        this.nivel = 0;
    }

    public void aumentarPuntaje() {
        puntaje += 10;
    }

    public void subirNivel() {
        nivel++;
    }

    public int bonus(int valor) {
        return puntaje += valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}