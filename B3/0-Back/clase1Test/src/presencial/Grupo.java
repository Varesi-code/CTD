package presencial;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Persona> listaPersonas;

    public Grupo(){
        listaPersonas= new ArrayList<>();
    }

    public void agregarPersona(Persona per){
        if (per.getEdad()>18 && per.getNombre().length()>=5){
            //deberiamos agregar a la persona
            listaPersonas.add(per);
            System.out.println("Agregando a "+per);
        }
        else{
            System.err.println("No se puede agregar a "+per.getNombre()+ " al grupo.");
        }
    }
    public int getPersonasEnElGrupo(){
        return listaPersonas.size();
    }
}
