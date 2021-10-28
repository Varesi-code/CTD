package Clase4.colearning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cuantosPrimos = 0;
        System.out.println("Ingrese cuantos primos: ");
        cuantosPrimos = scanner.nextInt();

        buscaPrimo(cuantosPrimos);
    }
    public static void buscaPrimo(int quePrimo){
        int i = 2;
        for(int cuantos = 0; cuantos < quePrimo; i++){
            if(esPrimo(i)){
                System.out.println("Es primo " + i);
                cuantos++;
            }
        }

    }
    public static boolean esPrimo(int nro) {
        boolean es = true;
        for (int i = 2; i < nro; i++) {
            if (nro%i == 0) {
                es = false;
            }
        }
        return es;
    }

}
