package presencial;

public class ManejadorSpam extends Manejador{
    @Override
    public String comprobar(Mail elMail) {
        return "Marcado como spam";
    }
}
