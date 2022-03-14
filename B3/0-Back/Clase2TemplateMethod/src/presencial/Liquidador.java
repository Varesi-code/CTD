package presencial;

public abstract class Liquidador {
    public String liquidarSueldo(Empleado empleado) {
        String respuesta = "La liquidacion no pudo ser calculada";
        double sueldo = calcularSueldo(empleado);
        if (sueldo > 0) {
            respuesta = imprimirRecibo(empleado) +"Saldo a liquidar: "+ sueldo;
        }
        return respuesta;
    }
    protected abstract double calcularSueldo(Empleado empleado);
    protected abstract String imprimirRecibo(Empleado empleado);
    private String depositarSueldo(Empleado empleado) {
        return "Orden de deposito en la cuenta de " + empleado.getNombre();
    }
}
