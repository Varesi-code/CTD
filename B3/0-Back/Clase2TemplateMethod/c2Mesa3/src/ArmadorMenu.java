public abstract class ArmadorMenu {
    public String prepararMenu(Menu menu){
        String respuesta ="El menu no pudo ser armado";
        String menu = menu.;

        return respuesta;
    }
    protected abstract String armarMenu(Menu menu);
    protected abstract double calculoPrecioVenta(Menu menu);

    private String imprimirRecibo(Menu menu){
        String recibo = "";
        recibo += "El precio es: " + menu.getPrecioBase() + "\n";
        recibo += "El precio de venta es: " + calculoPrecioVenta(menu) + "\n";
        return recibo;
    }

    }


