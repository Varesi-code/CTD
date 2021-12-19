public class Curso extends OfertaAcademica{
    private double valorHora;
    private int cargaHoraria;
    private int duracion;


    @Override
    public double getPrecio() {
        return this.valorHora * this.cargaHoraria * this.duracion;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
