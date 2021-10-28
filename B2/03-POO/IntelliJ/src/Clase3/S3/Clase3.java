package Clase3.S3;

import java.util.Scanner;

public class Clase3 {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        // declarar variables del perro

        String nombrePerro = "";
        double cantidadComidaDiaria = 0.0;

        //ingreso datos

        System.out.println("Como se llama: ");
        nombrePerro = scanner.nextLine();
        System.out.println("Cuanto come: ");
        cantidadComidaDiaria = scanner.nextDouble();
        System.out.println(nombrePerro+" precisa de "+cuantosPaquetes(cantidadComidaDiaria)+" paquetes");


    }

    public static int cuantosPaquetes( double cuantoComePerrito){

        Scanner sc = new Scanner(System.in);

        //declaro variables

        double pesoPaquete = 0.0;
        double pesoTotal = 0.0;
        int cantidadPaquetes = 0;

        //repito los paquetes hasta que alcancen
        while (pesoTotal<cuantoComePerrito){
            //leer paquete
            System.out.println("Peso del Paquete: ");
            pesoPaquete = sc.nextDouble();

            //acumulo
            pesoTotal += pesoPaquete;
            cantidadPaquetes++;



        }

        return cantidadPaquetes;

    }
}
//https://drive.google.com/file/d/1wVAFriKYX8e4kz8lXm57ZsTZqxaiZTTJ/view