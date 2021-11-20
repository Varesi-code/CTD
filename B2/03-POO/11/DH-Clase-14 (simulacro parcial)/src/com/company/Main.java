package com.company;

public class Main {

    public static void main(String[] args) {
        /*El ejercicio no pide explicitamente hacer nada sobre el main pero a modo de ejemplo
        probamos los metodos implementados*/

        //Probamos el método compareTo que debíamos sobreescribir
        Comparable yate1 = new Yate(4);
        Comparable yate2 = new Yate(5);


        if(yate1.compareTo(yate2) == 0){
            System.out.println("Yate 1 es igual a Yate 2");
        }else if(yate1.compareTo(yate2) > 0) {
            System.out.println("Yate 1 es mayor a Yate 2");
        } else{
            System.out.println("Yate 2 es mayor a Yate 1");
        }

        //Probamos métodos de la clase Velero
        Velero velero = new Velero();
        //Probamos el constructor solicitado
        Capitan capitan = new Capitan("Juan","Rodriguez",3287);
        velero.setCapitan(capitan);
        velero.setAñoFabricacion(2021);
        velero.setValorAdicional(500);
        velero.setValorBase(10000);
        velero.setCantMastiles(10);

        if(velero.esVeleroGrande())
            System.out.println("Es un velero grande");
        else
            System.out.println("Es un velero chico");

        System.out.println("Monto alquiler velero:" + velero.montoAlquiler());




    }

}
