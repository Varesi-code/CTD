package presencial;

public class ManejadorGerencia extends Manejador {
    @Override
    public String comprobar(Mail elMail) {
        if (elMail.getDestino().equals("gerencia@colmena.com")||elMail.getTema().equals("gerencia")){
            return "Enviando a gerencia";
        }
        else{
            return getSiguienteManejador().comprobar(elMail);
        }
    }
}
