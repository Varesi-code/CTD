package Clase2.A2;

import java.util.Scanner;

public class A2b {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = scanner.nextInt();

        if(esDivisible(num1, num2))
        {
            System.out.println(num1+" es divisible por "+ num2);
        }else{
            System.out.println(num1+" no es divisible por "+ num2);
        };
    }
    static boolean esDivisible(int n, int divisor){
        if (n % divisor == 0){
            return true;
        }
        else{
            return false;
        }
    };
}
//FUNCIONES https://drive.google.com/file/d/16X8GpmoK9FmeEJVtY-90X62BKxRk6LfQ/view
