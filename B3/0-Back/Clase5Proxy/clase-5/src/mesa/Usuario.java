package mesa;

public class Usuario {
    private boolean usuarioPremium;
    private String identificador;

    public Usuario(boolean usuarioPremium, String identificador) {
        this.usuarioPremium = usuarioPremium;
        this.identificador = identificador;
    }

    public boolean isUsuarioPremium() {
        return usuarioPremium;
    }

    public void setUsuarioPremium(boolean usuarioPremium) {
        this.usuarioPremium = usuarioPremium;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
}
