package com.company;

public class FacadeBuscar implements Busqueda{
    private ApiVuelo apiVuelo;
    private ApiHotel apiHotel;

    public FacadeBuscar(){
        apiHotel = new ApiHotel();
        apiVuelo = new ApiVuelo();
    }
    @Override
    public String buscar(Hotel unHotel, Vuelo unVuelo){

    }

}
