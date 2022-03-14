package Mesas;

public class Arbol {
    private int ancho;
    private int alto;
    private String color;
    private String tipo;
    private static int contador;


    public Arbol( String tipo,String color, int alto, int ancho) {
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.tipo = tipo;
        contador ++;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
