package Clase2.M2;
import java.util.Scanner;

public class M2 {
    public static void main(String[] args) {
        Integer num1;
        boolean flag = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        num1=scanner.nextInt();

        for (int i = 2; i <= num1 / 2; ++i) {
            // condition for nonprime number
            if (num1 % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num1 + " es un numero primo.");
        else
            System.out.println(num1 + " no es un numero primo.");
    }
}

//https://drive.google.com/file/d/1SiUDv0GJIQRtjzv1e03yhCObSLQLoOxF/view