package presencial;

public class EmpleadoContratado extends Empleado {
    private double horasTrabajadas;
    private double valorHora;

    public EmpleadoContratado(String nombre, String apellido, String dni, double horasTrabajadas, double valorHora) {
        super(nombre, apellido, dni);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
