package MesaTrabajo;

public class Circulo implements AreaCalculable {
    private double radio;
    private String nombre;

    @Override
    public String calcularArea() {
        return "el area del circulo es: " + Math.PI * Math.pow(radio, 2);
    }

}
