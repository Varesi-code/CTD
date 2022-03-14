package com.company;

import java.util.Date;

public class Hotel {
    private Date fechaEntrada;
    private Date fechaSalida;
    private String ciudad;
    private String nombreHotel;

    public Hotel(Date fechaEntrada, Date fechaSalida, String ciudad, String nombreHotel) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.ciudad = ciudad;
        this.nombreHotel = nombreHotel;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public String getCiudad() {
        return ciudad;
    }
    public String getNombreHotel(){
        return nombreHotel;
    }
}
