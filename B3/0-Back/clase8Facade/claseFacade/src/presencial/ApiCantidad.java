package presencial;

public class ApiCantidad {
    public int descuentoXCantidad(int cuantos){
        //lógica del negocio
        int resp=0;
        if (cuantos>12){
            resp=15;
        }
        return resp;
    }
}
