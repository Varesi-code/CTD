package Clase2.A2;
//importar la clase
import java.util.Scanner;

public class A2a {
    public static void main(String[] args){
        //defino un objeto de tipo Scanner
        Scanner scanner;
        //crear el objeto Scanner( System.in es toda la informcion que se ingresan por teclado)
        scanner = new Scanner(System.in);
        //definir variables de distinto tipo
        int edad;
        String nombre;
        //para hacer el ingreo de las variables voy a tener que usar los metodos de Scanner adecuados a los tipos de objetos que estoy utilizando
        //para ingresar cadenas se usa nextLine()
        System.out.println("Ingrese su nombre:");
        nombre=scanner.nextLine();
        //para ingresar datos numericos utilizo nextInt() o .nextFloat()
        System.out.println("Ingrese su edad");
        edad= scanner.nextInt();


    }
}
