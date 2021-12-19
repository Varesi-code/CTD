package com.company;

import java.util.ArrayList;
import java.util.List;

public class SistemaGestion {
    private List<Servicio> servicios=new ArrayList<Servicio>();


    public void agregar(Servicio servicio) {
        servicios.add(servicio);
    }

    public void listar(){
        for(Servicio servicio:servicios){
            System.out.println(servicio.getNombre()+": ");
            System.out.println(servicio.getPrecio());
        }
    }

}

