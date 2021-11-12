package Clase10.M10;

import java.util.Objects;

public class Objeto {
    private int posX;
    private int posY;
    private char direccion;

    public Objeto(int posX, int posY, char direccion){
        this.posX = posX;
        this.posY = posY;
        this.direccion = direccion;
    }

    public void irA (int x, int y, char direccion){
        this.direccion = direccion;
        this.posX = x;
        this.posY = y;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", direccion=" + direccion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Objeto)) return false;
        Objeto objeto = (Objeto) o;
        return getPosX() == objeto.getPosX() && getPosY() == objeto.getPosY() && getDireccion() == objeto.getDireccion();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPosX(), getPosY(), getDireccion());
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }
}
