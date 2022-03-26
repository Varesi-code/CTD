import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //crear una empresa
        Empresa empresa= new Empresa("14-58485989-5","Empresaurio S.A.");

        //cargar los 4 empleados
        Empleado emp1= new Empleado("Pedro","Rocha",0,100000);
        Empleado emp2= new Empleado("Peter","Rocha",1,50487);
        Empleado emp3= new Empleado("Laura","Rocha",2,14258);
        Empleado emp4= new Empleado("Leandro","Rocha",3,65824);

        empresa.agregarEmpleado(emp1);
        empresa.agregarEmpleado(emp2);
        empresa.agregarEmpleado(emp3);
        empresa.agregarEmpleado(emp4);
        //guardar los empleados en un archivo separados por ;

        FileOutputStream fos=null;

        try{
            fos=new FileOutputStream("Empleados.txt");
            BufferedOutputStream buffer= new BufferedOutputStream(fos);
            for (Empleado empleado:empresa.getEmpleados()) {
                //recorriendo empleado a empleado
                String linea=empleado.toString()+"\n";
                buffer.write(linea.getBytes());
                System.out.println(linea);
            }
            buffer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
