package presencial;

public class ApiTarjeta {
    public int descuentoXTarjeta(Tarjeta unaTarjeta){
        int resp=0;
        if (unaTarjeta.getBanco().equals("Star Bank")){
            resp=20;
        }
        return resp;
    }
}
