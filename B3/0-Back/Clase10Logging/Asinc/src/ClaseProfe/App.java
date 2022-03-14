package ClaseProfe;

import org.apache.log4j.Logger;

import java.util.List;
import java.util.ArrayList;

public class App {
    private static final Logger logger = Logger.getLogger(App.class);
    private List<Integer> listaEnteros;

    public App() {
        this.listaEnteros = new ArrayList<>();
    }

    public void agregarEntero(int numero){
        listaEnteros.add(numero);
        if(listaEnteros.size() > 5){//escribir en el log
            logger.info("la lista tiene mas de 5 elementos, elementos totales: "+listaEnteros.size());
        }
        if(listaEnteros.size() > 10){//escribir en el log
            logger.warn("la lista tiene mas de 10 elementos, elementos totales: "+listaEnteros.size());
    }
    }
}



