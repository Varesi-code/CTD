import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<OfertaAcademica> lasOfertas = new ArrayList<OfertaAcademica>();

    public void agregarOferta(OfertaAcademica oferta){
        lasOfertas.add(oferta);
    }
    public void listado (){
        for (OfertaAcademica oferta: lasOfertas){
            System.out.println("cursos y talleres del instituto: "+oferta.getNombre());
            System.out.println(" -> ");
            System.out.println("precio: "+oferta.getPrecio());
        }
    }
}
