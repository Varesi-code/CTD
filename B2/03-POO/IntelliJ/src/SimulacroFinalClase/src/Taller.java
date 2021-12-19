public class Taller extends OfertaAcademica{
    private double precioTP;
    private int cantTP;

    @Override
    public double getPrecio() {
        return precioTP*cantTP;
    }

    public double getPrecioTP() {
        return precioTP;
    }

    public void setPrecioTP(double precioTP) {
        this.precioTP = precioTP;
    }

    public int getCantTP() {
        return cantTP;
    }

    public void setCantTP(int cantTP) {
        this.cantTP = cantTP;
    }
}
