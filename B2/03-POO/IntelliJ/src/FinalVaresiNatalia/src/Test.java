public class Test {
    public static void main(String[] args) {
        Pizzeria pizzaLoca = new Pizzeria();

        try {
            Simple simple1 = (Simple) PizzaFactory.getInstance().getPizza("simple");
            simple1.setNombre("muzzarella");
            simple1.setDescripcion("chica, con muzzarella, tomate y albahaca");
            simple1.setPrecio(700);
            simple1.setEsGrande(false);

            Simple simple2 = (Simple) PizzaFactory.getInstance().getPizza("simple");
            simple2.setNombre("especial");
            simple2.setDescripcion("chica, con muzzarella, jamon, tomate y morron");
            simple2.setPrecio(850);
            simple2.setEsGrande(false);

            Simple simple3 = (Simple) PizzaFactory.getInstance().getPizza("simple");
            simple3.setNombre("ananá");
            simple3.setDescripcion("chica, con muzzarella, ananá y tomate");
            simple3.setPrecio(950);
            simple3.setEsGrande(false);

            Combinada combinada1 = (Combinada) PizzaFactory.getInstance().getPizza("combinada");
            combinada1.setNombre("combinada loca");
            combinada1.setDescripcion("media " + simple2.getNombre() + " y media de " + simple3.getNombre());
            System.out.println(combinada1.getPrecio());

            combinada1.agrega(simple2);
            combinada1.agrega(simple3);

            pizzaLoca.agregarPizza(simple1);
            pizzaLoca.agregarPizza(simple2);
            pizzaLoca.agregarPizza(simple3);
            pizzaLoca.agregarPizza(combinada1);

            pizzaLoca.listar();

        } catch (NombreException e) {
            System.err.println(e.getMessage());        }
    }
}
