package mesa;

public class ServicioDescargaProxy implements Descarga{

    @Override
    public String descarga(Usuario usuario) {
        String mensaje = "Hubo un error sos un usuario free";
        if (usuario.isUsuarioPremium()){
            ServicioDescarga descarga = new ServicioDescarga();
            mensaje = descarga.descarga(usuario);
        }
        return mensaje;
    }
}
