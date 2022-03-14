package presencial;

public class ManejadorTecnica extends Manejador{

    @Override
    public String comprobar(Mail elMail) {
        if (elMail.getDestino().equals("tecnica@colmena.com")||elMail.getTema().equals("tecnica")){
            return "Enviando a tecnica";
        }
        else{
            return getSiguienteManejador().comprobar(elMail);
        }
    }
}
