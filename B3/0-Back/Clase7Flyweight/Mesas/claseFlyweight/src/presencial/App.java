package presencial;

public class App {
    public static void main(String[] args) {
        ComputadoraFactory computer= new ComputadoraFactory();
        Computadora c1= computer.getComputadora(16,500);
        Computadora c2= computer.getComputadora(2,256);
        Computadora c3= computer.getComputadora(16,500);

        System.out.println(c1.toString());
        System.out.println(c2);
        System.out.println(c3);

        for (int i=1;i<=100;i++){
            computer.getComputadora(2,256);
        }
    }
}
