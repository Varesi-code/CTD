package com.company;

public class Jugador implements Comparable {

    private int numeroCamiseta;
    private String nombre;
    private boolean lesionado;
    private boolean titular;

    @Override
    public int compareTo(Object o) {
        return this.numeroCamiseta - ((Jugador)o).getNumeroCamiseta();
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numeroCamiseta=" + numeroCamiseta +
                ", nombre='" + nombre + '\'' +
                ", lesionado=" + lesionado +
                ", titular=" + titular +
                '}';
    }

    public Jugador(int numeroCamiseta, String nombre, boolean lesionado, boolean titular) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public boolean esTitular(){
        return titular;
    }

    public boolean estaLesionado(){
        return lesionado;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
