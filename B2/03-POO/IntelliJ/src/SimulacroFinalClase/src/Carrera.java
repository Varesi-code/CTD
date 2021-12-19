import java.util.ArrayList;
import java.util.List;

public class Carrera extends OfertaAcademica{
    private double basico;
    private List<OfertaAcademica> ofertas=new ArrayList<OfertaAcademica>();

    @Override
    public double getPrecio() {
        double precio=0;
        for(OfertaAcademica oferta:ofertas){
            precio+=oferta.getPrecio();
        }
        return basico+precio;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public void agregarOferta(OfertaAcademica oferta) throws CarreraException{
        if (oferta instanceof Curso) {
            if (((Curso) oferta).getCargaHoraria() > 10) {
                throw new CarreraException("La carga horaria del curso no puede ser mayor a 10");
            }
        }
        ofertas.add(oferta);
    }

}

