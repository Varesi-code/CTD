import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{
    private double bonificacion;
    private List<OfertaAcademica> ofertas = new ArrayList<OfertaAcademica>();

    public void agregarOferta(OfertaAcademica oferta){
        ofertas.add(oferta);
    }
    @Override
    public double getPrecio(){
        double precio = 0;
        for(OfertaAcademica oferta : ofertas){
            precio += oferta.getPrecio();
        }
        return precio * (100 - this.bonificacion) / 100;
    }


    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

}
