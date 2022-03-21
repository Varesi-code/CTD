package presencial;

import org.apache.log4j.Logger;


import java.util.ArrayList;
import java.util.List;

public class App {
    private static final Logger logger= Logger.getLogger(App.class);
    private List<Integer> listaEnteros;

    public App(){
        listaEnteros= new ArrayList<>();
    }

    public void agregarEntero(Integer n) throws Exception{
        listaEnteros.add(n);
        if (listaEnteros.size()>5){
            //escribir en el log
            logger.info("La lista tiene más de 5 elementos, elementos totales de la lista: "+listaEnteros.size());
        }
        if (listaEnteros.size()>10){
            //escribir en el log
            logger.info("La lista tiene más de 10 elementos, elementos totales de la lista: "+listaEnteros.size());
        }
        if(listaEnteros.isEmpty()){
            //escribir en el log
            logger.error("La lista está vacía");
            //tirar excepcion
            throw new Exception("La lista esta vacia");
        }

    }

    public void promedio(){
        int suma=0;
        for (Integer n: listaEnteros){
            suma+=n;
        }
        logger.info("el promedio de los numeros en la lista es: "+suma/listaEnteros.size()) ;
    }

    public void maximoYMinimo(){
        int max=listaEnteros.get(0);
        int min=listaEnteros.get(0);
        for (Integer n: listaEnteros){
            if (n>max){
                max=n;
            }
            if (n<min){
                min=n;
            }
        }
        logger.info(  " el maximo y minimo de los numeros en la lista es: "+max+min);
    }
}
