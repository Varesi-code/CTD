package com.company;

import java.util.Date;

public class Vuelo {
    private Date fechaSalida;
    private Date fechaRegreso;
    private String origen;
    private String destino;
    private String numeroVuelo;

    public Vuelo(Date fechaSalida, Date fechaRegreso, String origen, String destino, String numeroVuelo) {
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.origen = origen;
        this.destino = destino;
        this.numeroVuelo = numeroVuelo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }
    public String getNumeroVuelo() {
        return numeroVuelo;
    }
}
