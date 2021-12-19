import java.util.ArrayList;
import java.util.List;

public class Combinada implements Pizza{
    private String nombre;
    private String descripcion;
    private List<Pizza> pizzas=new ArrayList<Pizza>();

    @Override
    public double getPrecio() {
        double precio=0;
        for(Pizza pizza:pizzas){
            precio+=pizza.getPrecio();
        }
        return precio/pizzas.size();
    }

    public void agrega(Pizza pizza){
        pizzas.add(pizza);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
