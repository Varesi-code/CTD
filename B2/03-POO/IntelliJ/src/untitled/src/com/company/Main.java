package com.company;

public class Main {

public static void main(String[] args) {
        SistemaGestion sistema1 = new SistemaGestion();


        try {
            Simple simple1 = (Simple) ServicioFactory.getInstance().getServicio("simple");

            simple1.setNombre("Venta de aire acondicionado");
            simple1.setPrecio(65000);

            Simple simple2 = null;

            simple2 = (Simple) ServicioFactory.getInstance().getServicio("simple");

            simple2.setNombre("colocacion");
            simple2.setPrecio(10000);
            System.out.println("Precio del servicio colocacion: " + simple2.getPrecio());

            Combo combo1 = null;

            combo1 = (Combo) ServicioFactory.getInstance().getServicio("combo");

            combo1.setDescuento(10);
            combo1.setNombre("Combo 1");

            combo1.agregaServicio(simple1);
            combo1.agregaServicio(simple2);

            System.out.println("Precio del servicio combo1: " + combo1.getPrecio());

            sistema1.agregar(combo1);
            sistema1.listar();
        } catch (FactoryException e) {
            System.err.println(e.getMessage());
        }
    }
}
