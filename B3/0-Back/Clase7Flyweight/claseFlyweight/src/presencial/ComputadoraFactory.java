package presencial;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFactory {
    private static Map<String,Computadora> computadorasLigeras= new HashMap<>();

    public Computadora getComputadora(int ram, int disco){
        //preparar la clave
        String clave="key:"+ram+":"+disco;
        System.out.println(clave);
        //consultar si existe una computadora con esa clave
        if (!computadorasLigeras.containsKey(clave)){
            //no exista la computadora, debemos instanciarla con la factory
            computadorasLigeras.put(clave,new Computadora(ram,disco));
            System.out.println("Computadora creada");
            return computadorasLigeras.get(clave);
        }
        System.out.println("Computadora recuperada/obtenida");
        return computadorasLigeras.get(clave);
        //obtener la computadora desde el hash, usando la clave.
    }
}
