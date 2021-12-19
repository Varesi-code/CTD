public class Main {
    public static void main(String[] args) {
        Instituto instituto1 = new Instituto();

        ProgramaIntensivo programa1 = (ProgramaIntensivo) OfertaFactory.getInstance().getOfertaAcademica("intensivo");
        Curso curso1 = (Curso) OfertaFactory.getInstance().getOfertaAcademica("curso");
        Taller taller1 = (Taller) OfertaFactory.getInstance().getOfertaAcademica("taller");
        Carrera carrera1 = (Carrera) OfertaFactory.getInstance().getOfertaAcademica("carrera");

        ((Curso)curso1).setNombre("backend");
        ((Curso)curso1).setDuracion(2);
        ((Curso)curso1).setCargaHoraria(16);
        ((Curso)curso1).setValorHora(1000);

        ((ProgramaIntensivo)programa1).setNombre("Programa Intensivo");
        ((ProgramaIntensivo)programa1).setBonificacion(20);
        ((ProgramaIntensivo)programa1).agregarOferta(curso1);

        ((Taller)taller1).setNombre("Taller de programacion");
        ((Taller)taller1).setCantTP(4);
        ((Taller)taller1).setPrecioTP(500);

        ((Carrera)carrera1).setNombre("Ingenieria de Software");
        ((Carrera)carrera1).setBasico(9000);
        try {
            ((Carrera)carrera1).agregarOferta(taller1);
            ((Carrera)carrera1).agregarOferta(curso1);
        } catch (CarreraException e) {
            System.err.println(e.getMessage());
        }

        instituto1.agregarOferta(programa1);
        instituto1.agregarOferta(curso1);
        instituto1.agregarOferta(taller1);
        instituto1.agregarOferta(carrera1);

        instituto1.listado();

    }
}
//https://drive.google.com/file/d/1DlXm9PPeJG2KGvT3vVlm8kEid5f1sjoV/view
