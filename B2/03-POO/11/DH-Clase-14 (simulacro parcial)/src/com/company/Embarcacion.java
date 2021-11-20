package com.company;

/*Es una clase abstracta ya que no deseamos que nadie pueda instanciar algo tan abstracto*/
public abstract class Embarcacion {
    private int añoFabricacion;
    private double eslora;
    private double valorBase;
    private double valorAdicional;
    private Capitan capitan; //implementación de la relación de asociacion. "una embarcación tiene un capitan"

    public static final int EMBARCACION_NUEVA = 2020;

    /*Implementación del método solicitdo para calcular el alquiler de una embarcación*/
    public double montoAlquiler(){
        double montoAlquiler = valorBase;
        if(añoFabricacion > EMBARCACION_NUEVA)
            montoAlquiler += valorAdicional;

        return montoAlquiler;
    }

    /*Getters y Setters*/

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }



}
