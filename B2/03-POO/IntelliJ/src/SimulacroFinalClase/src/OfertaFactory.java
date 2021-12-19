public class OfertaFactory {
    private static OfertaFactory instance = new OfertaFactory();

    private OfertaFactory() {
    }

    public static OfertaFactory getInstance() {
        return instance;
    }
    public OfertaAcademica getOfertaAcademica (String oferta){
        OfertaAcademica ofertaAcademica = null;
        if (oferta.equals("curso")){
            ofertaAcademica = new Curso();
        }
        if (oferta.equals("intensivo")){
            ofertaAcademica = new ProgramaIntensivo();
        }
        if (oferta.equals("taller")){
            ofertaAcademica = new Taller();
        }
        if (oferta.equals("carrera")){
            ofertaAcademica = new Carrera();
        }
        return ofertaAcademica;
    }
}



