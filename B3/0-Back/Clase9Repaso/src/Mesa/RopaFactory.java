package Mesa;

import java.util.HashMap;
import java.util.Map;

public class RopaFactory {
    public static final Map<String, Ropa> lista = new HashMap<>();

    public static Ropa getRopa(String talle, String tipo, boolean esNuevo, boolean importado) {
        String clave = "key:"+talle+tipo+esNuevo+importado;
        if (!lista.containsKey(clave)) {
            lista.put(clave, new Ropa(talle, tipo, esNuevo, importado));
            System.out.println("Se creo una nueva lista de ropa");
            return lista.get(clave);
        }
        System.out.println("Se encontro una lista de ropa");
        return lista.get(clave);
    }
}
