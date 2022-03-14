package presencial;

public class FacadeDescuento implements Descuento{
    //atributos para cada API
    private ApiCantidad apiCantidad;
    private ApiProducto apiProducto;
    private ApiTarjeta apiTarjeta;

    public FacadeDescuento(){
        apiCantidad= new ApiCantidad();
        apiProducto= new ApiProducto();
        apiTarjeta=new ApiTarjeta();
    }

    @Override
    public int descuento(Tarjeta tarj, Producto prod, int cant) {
        int elDescuento=0;
        // consultar a las API para buscar los descuento, si corresponden
        elDescuento+=apiCantidad.descuentoXCantidad(cant);
        elDescuento+=apiProducto.descuentoXProducto(prod);
        elDescuento+=apiTarjeta.descuentoXTarjeta(tarj);
        return elDescuento;
    }
}
