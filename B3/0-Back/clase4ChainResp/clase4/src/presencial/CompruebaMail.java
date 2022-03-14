package presencial;

public class CompruebaMail {
    private Manejador inicial;

    public CompruebaMail(){
        inicial= new ManejadorGerencia();
        Manejador comercial= new ManejadorComercial();
        Manejador tecnica= new ManejadorTecnica();
        Manejador spam= new ManejadorSpam();

        inicial.setSiguienteManejador(comercial);
        comercial.setSiguienteManejador(tecnica);
        tecnica.setSiguienteManejador(spam);
    }

    public Manejador getInicial() {
        return inicial;
    }

    public String comprobar(Mail elMail){
        return inicial.comprobar(elMail);
    }
}
