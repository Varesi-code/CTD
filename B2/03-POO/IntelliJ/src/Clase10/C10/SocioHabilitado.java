package Clase10.C10;

public class SocioHabilitado extends Socio {
    private double costoPileta;
    private boolean habilitado;

    public SocioHabilitado(String numero, String nombre, double cuota, String actividad, double pileta, boolean habilitado) {
        super(numero, nombre, cuota, actividad);
        this.costoPileta = pileta;
        this.habilitado = habilitado;
    }

    @Override
    public String toString() {
        return super.toString() + "SocioHabilitado{" +
                "costoPileta=" + costoPileta +
                ", habilitado=" + habilitado +
                '}';
    }

    @Override
    public double costoMensual() {
        double total = super.costoMensual();
        if (this.habilitado) {
            total += this.costoPileta;
        }
        return total;
    }

    public void setCostoPileta(double costoPileta) {
        this.costoPileta = costoPileta;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
