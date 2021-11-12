package Clase10.M10;

public class Nave extends Objeto {
    private double velocidad;
    private int vida;

    public Nave (int x, int y, char direccion, double velocidad){
        super(x,y,direccion);
        this.velocidad = velocidad;
        this.vida = 100;
    }

    @Override
    public void irA(int x, int y, char direccion){
        super.irA(x,y,direccion);
    }

    public void girar( char direccion){
        super.setDireccion(direccion);
    }

    public int restarVida(int vidaARestar){
        this.vida -= vidaARestar;
        return this.vida;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
