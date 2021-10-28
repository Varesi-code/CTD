
public class A1 {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 20;
        double cociente = num1 % num2;
        String mensaje;
        if (cociente == 0 ){
            mensaje = num1 + " es divisible por " + num2;
        } else {
            mensaje = num1 + " no es divisible por " + num2;
        }
        System.out.println(mensaje);
    }
}