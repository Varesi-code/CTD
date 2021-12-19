public class Simple implements Pizza{
    private String nombre;
    private String descripcion;
    private double precio;
    private boolean esGrande;

    public void setPrecio(double precio){
        if(esGrande){
            precio *= 2;
        }
        this.precio = precio;

    }
    @Override
    public double getPrecio(){
        return this.precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEsGrande() {
        return esGrande;
    }

    public void setEsGrande(boolean esGrande) {
        this.esGrande = esGrande;
    }
}
