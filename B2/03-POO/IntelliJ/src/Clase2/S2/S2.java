package Clase2.S2;

import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {
        String nombre, apellido;
        String iniciales;
        int dia, mes, anio;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre:");
        nombre= scanner.nextLine();

        System.out.println("Ingrese apellido:");
        apellido= scanner.nextLine();

        iniciales = String.valueOf(nombre.charAt(0)) + String.valueOf(apellido.charAt(0));
        iniciales = iniciales.toUpperCase();

        System.out.println("dia: ");
        dia = scanner.nextInt();
        System.out.println("mes: ");
        mes = scanner.nextInt();
        System.out.println("año: ");
        anio = scanner.nextInt();

        System.out.println(nombre+" " +apellido +" \""+ iniciales +"\"");
        System.out.println(devolverFecha(dia, mes, anio));

    }
    public static String devolverFecha(int d, int m, int a){
        return " "+d+"/"+m+"/"+a;
    }
}
