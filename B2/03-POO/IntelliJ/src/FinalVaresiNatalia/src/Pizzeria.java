import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private List<Pizza> pizzas = new ArrayList<Pizza>();

    public void agregarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void listar(){
        for (Pizza pizza : pizzas) {
            System.out.println();
            System.out.println(pizza.getNombre()+": "+ pizza.getDescripcion()+". Precio: $ " + pizza.getPrecio());

        }
    }
}
