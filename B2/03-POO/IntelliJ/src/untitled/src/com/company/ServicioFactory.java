package com.company;

public class ServicioFactory {
    private static ServicioFactory instance = new ServicioFactory();

    private ServicioFactory() {}

    public static ServicioFactory getInstance() {
        return instance;
    }

    public Servicio getServicio(String servicio) throws FactoryException{
        Servicio s = null;
        if(!servicio.equals("simple") && !servicio.equals("combo")){
            throw new FactoryException("Servicio no encontrado. Introduce 'simple' o 'combo'.");
        }
        if(servicio.equals("simple")){
            s =  new Simple();
        }
        if (servicio.equals("combo")){
            s = new Combo();
        }
        return s;
    }
}
