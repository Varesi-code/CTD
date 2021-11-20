package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Capitan capitan1 = new Capitan("Zulma", "Lobato", "maipo01");
        Capitan capitan2 = new Capitan("Juan", "Perez", "maipo02");
        Capitan capitan3 = new Capitan("Pedro", "Piazzolla", "maipo03");

        Velero velero1 = new Velero(1000.00, 500.00, 2021, 30,4);

        Yate yate1 = new Yate(2000.00, 500.00, 2021, 30,3);
        Yate yate2 = new Yate(3000.00, 500.00, 2020, 30, 5);

        yate1.setCapitan(capitan1);
        yate2.setCapitan(capitan2);
        velero1.setCapitan(capitan3);

        System.out.println(yate1);
        System.out.println(yate2);
        System.out.println(velero1);

        if(yate1.compareTo(yate2) == 1){
            System.out.println("El yate 1 es mas lujoso que el yate 2");
        } else if (yate1.compareTo(yate2) == -1){
            System.out.println("El yate 2 es mas lujoso que el yate 1");
        } else {
            System.out.println("Los yates son igualmente lujosos");
        }

        if(velero1.calcularEsGrande() ){
            System.out.println("El velero es grande");
        }else{
            System.out.println("El velero no es grande");
        }

        System.out.println("El precio de alquiler del velero es $" + velero1.calcularAlquiler());
        System.out.println("El precio de alquiler del yate 1 es $" + yate1.calcularAlquiler());
        System.out.println("El precio de alquiler del yate 2 es $" + yate2.calcularAlquiler());


}
}