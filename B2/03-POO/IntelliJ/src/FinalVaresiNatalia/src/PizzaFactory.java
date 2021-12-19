public class PizzaFactory {
    private static PizzaFactory instance = new PizzaFactory();

    private PizzaFactory() {}

    public static PizzaFactory getInstance() {

        return instance;
    }

    public Pizza getPizza(String tipo) throws NombreException {
        Pizza pizza = null;
        if(!tipo.equals("simple") && !tipo.equals("combinada")) {
            throw new NombreException("Tipo de pizza no válido. Ingrese 'simple' o 'combinada'");
        }
        if (tipo.equals("simple")) {
            pizza = new Simple();
        }
        if(tipo.equals("combinada")){
            pizza= new Combinada();
        }
        return pizza;
    }
}
