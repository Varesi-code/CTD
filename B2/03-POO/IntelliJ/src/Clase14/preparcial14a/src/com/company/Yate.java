package com.company;

public class Yate extends Embarcacion implements Comparable{
    private int cantCamarotes;

    public Yate(double precioBase, double valorAdicional, int anioFabricacion,double esloraMetros, int cantCamarotes){
        super();
        setPrecioBase(precioBase);
        setValorAdicional(valorAdicional);
        setAnioFabricacion(anioFabricacion);
        setEsloraMetros(esloraMetros);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        Yate y = (Yate)o;
        if (this.cantCamarotes > y.cantCamarotes){
            return 1;
        }else if (this.cantCamarotes < y.cantCamarotes){
            return -1;
        }
        return 0;
    }
    //@Override
    //    public int compareTo(Object y2) {
    //
    //        return this.cantCamarotes - ((Yate)y2).getCantCamarotes();

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public String toString() {
        return super.toString() +" Yate{" +
                "cantCamarotes=" + cantCamarotes +
                '}';
    }
}
