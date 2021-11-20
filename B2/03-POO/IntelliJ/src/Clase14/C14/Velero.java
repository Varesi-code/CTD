package Clase14.C14;


public class Velero extends Embarcacion{
    private int cantMastiles;

    public Velero( double precioBase,double valorAdicional, int anioFabricacion,double esloraMetros, int cantMastiles) {
        super();
        setPrecioBase(precioBase);
        setValorAdicional(valorAdicional);
        setAnioFabricacion(anioFabricacion);
        setEsloraMetros(esloraMetros);
        this.cantMastiles = cantMastiles;
    }
    public boolean esGrande() {
        if (cantMastiles > 4) {
            return true;
        }
        return false;
    }

    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }
}
