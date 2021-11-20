package com.company;

/*Implementacion de la interface Comparable de Java*/
public class Yate extends Embarcacion implements Comparable{

    private int cantCamarotes;

    public Yate(int cantCamarotes){
        this.cantCamarotes = cantCamarotes;
    }
    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    /*Sobreescribimos el método compareTo que nos obliga la interface Comparable de Java*/
    @Override
    public int compareTo(Object y2) {

        return this.cantCamarotes - ((Yate)y2).getCantCamarotes();
    }
}
