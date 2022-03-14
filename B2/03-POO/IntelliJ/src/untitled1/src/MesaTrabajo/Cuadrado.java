package MesaTrabajo;

public class Cuadrado implements AreaCalculable {
    private String nombre;
    private double lado;

    public Cuadrado(String nombre, double lado) {
        this.nombre = nombre;
        this.lado = lado;
    }

    public String getNombre() {
        return nombre;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String calcularArea() {
        return "el area del cuadrado es: " + lado * lado;
    }
}


