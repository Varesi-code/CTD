package Clase5.S5;

public class S5 {
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    public S5(Integer numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        deuda = 0.0;
    }

    public void incrementarDeuda(Double cuanto) {
        System.out.println("Incremento de deuda: "+ cuanto);
        deuda += cuanto;
    }
    public void pagarDeuda() {
        System.out.println("Pago "+ deuda);
        deuda = 0.0;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public Double getDeuda() {
        return deuda;
    }

    public void setDeuda(Double deuda) {
        deuda = deuda;
    }

    @Override
    public String toString() {
        return "S5{" +
                "numeroCliente=" + numeroCliente +
                ", nombre='" + nombre + '\'' +
                ", deuda=" + deuda +
                '}';
    }
}

