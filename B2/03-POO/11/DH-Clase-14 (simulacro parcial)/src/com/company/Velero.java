package com.company;

public class Velero extends Embarcacion{

    private int cantMastiles;
    public static final int CANT_MASTILES_VELERO_GRANDE = 4;

    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }


    public boolean esVeleroGrande()
    {
        return this.getCantMastiles() > CANT_MASTILES_VELERO_GRANDE;
    }
}
