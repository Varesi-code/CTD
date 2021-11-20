package Clase14.C14;
import java.util.*;

public class Yate extends Embarcacion implements Comparable{
    private int cantCamarotes;

    public Yate( double precioBase, double valorAdicional, int anioFabricacion, double esloraMetros, int cantCamarotes) {
        super();
        setPrecioBase(precioBase);
        setValorAdicional(valorAdicional);
        setAnioFabricacion(anioFabricacion);
        setEsloraMetros(esloraMetros);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        if(cantCamarotes > ((Yate)o).cantCamarotes){
            return 1;}
        else if(cantCamarotes < ((Yate)o).cantCamarotes){
            return -1;
        }
        else{
            return 0;
        }
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }
}
