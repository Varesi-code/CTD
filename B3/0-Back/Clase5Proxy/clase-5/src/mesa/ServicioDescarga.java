package mesa;

public class ServicioDescarga implements Descarga{

    @Override
    public String descarga(Usuario usuario) {
        System.out.println("Verificando usuario");
        return "Se registro el usuario " + usuario.getIdentificador() + " como usuario premium";
    }
}
