package presencial;

public class ApiProducto {
    public int descuentoXProducto(Producto unProducto){
        int resp=0;
        if (unProducto.getTipo().equals("Latas")){
            resp=10;
        }
        return resp;
    }
}
