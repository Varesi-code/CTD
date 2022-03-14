package Mesa;

public class Ropa {
    private String talle;
    private String tipo;
    private boolean esNuevo;
    private boolean importado;

    public Ropa(String talle, String tipo, boolean esNuevo, boolean importado) {
        this.talle = talle;
        this.tipo = tipo;
        this.esNuevo = esNuevo;
        this.importado = importado;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }

    @Override
    public String toString(){
        return "Ropa{" +
                "talle='" + talle + '\'' +
                ", tipo='" + tipo + '\'' +
                ", esNuevo=" + esNuevo +
                ", importado=" + importado +
                '}';
    }

}
