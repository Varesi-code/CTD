package presencial;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    private static List<Perro> crearColeccion15Perros(){
        List<Perro> perritos= new ArrayList<>();
        String nombre;
        int edad;
        HashMap<Integer, String> nombrePosibles= new HashMap<>();
        nombrePosibles.put(1,"Tini");
        nombrePosibles.put(2,"Lucy");
        nombrePosibles.put(3,"Fisura");
        nombrePosibles.put(4,"Capitan");
        nombrePosibles.put(5,"Laila");
        nombrePosibles.put(6,"Comino");
        nombrePosibles.put(7,"Fly");
        nombrePosibles.put(8,"Pantuflas");
        nombrePosibles.put(9,"Ringo");
        nombrePosibles.put(10,"Rocky");
        nombrePosibles.put(11,"Carlitos");
        nombrePosibles.put(12,"Waldo");
        nombrePosibles.put(13,"África");
        nombrePosibles.put(14,"Abril");
        nombrePosibles.put(15,"Puppy");
        nombrePosibles.put(16,"Titán");
        nombrePosibles.put(17,"Hansel");
        nombrePosibles.put(18,"Suller");
        nombrePosibles.put(19,"Loki");
        nombrePosibles.put(20,"Centurion");

        for (int i=1;i<=15;i++){
            //buscar una edad random
            edad=(int)(Math.random()*17-1)+1;
            //buscar un nombre random
            nombre=nombrePosibles.get((int)(Math.random()*20-1)+1);
            //crear el objeto perro con los datos anteriores
            Perro can= new Perro(edad,nombre);
            //agregar el objeto a la colección
            perritos.add(can);
        }

        return perritos;
    }

    public static void main(String[] args) {
        //crear nuestra colección de perros
        List<Perro> canes= new ArrayList<>();
        //canes.add(new Perro(10,"Manchas"));
        canes=crearColeccion15Perros();
        //guardar en un archivo nuestra colección
        FileOutputStream fos=null;
        try{
            fos= new FileOutputStream("PerritosGuardados.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(canes);
            oos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //recuperar la colección desde un archivo a otra colección en Java
        List<Perro> canesRecuperados=null;
        FileInputStream fis=null;
        try {
            fis= new FileInputStream("PerritosGuardados.txt");
            ObjectInputStream ois= new ObjectInputStream(fis);
            canesRecuperados=(ArrayList)ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //mostrar la colección recuperada mediante consola
        for (Perro perro:canesRecuperados) {
            System.out.println(perro.toString());
        }
    }
}
