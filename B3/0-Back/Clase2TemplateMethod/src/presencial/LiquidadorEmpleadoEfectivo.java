package presencial;

public class LiquidadorEmpleadoEfectivo extends Liquidador{

    @Override
    protected double calcularSueldo(Empleado empleado) {
        double mensajeDeRespuesta = 0;
        if (empleado instanceof EmpleadoEfectivo) {
            mensajeDeRespuesta = ((EmpleadoEfectivo) empleado).getSueldoBasico() + ((EmpleadoEfectivo) empleado).getPremios()-((EmpleadoEfectivo) empleado).getDescuentos();
        }
        return mensajeDeRespuesta;
    }

    @Override
    protected String imprimirRecibo(Empleado empleado) {
        return "La liquidacion generada es un documento digital.\n";
    }
}
