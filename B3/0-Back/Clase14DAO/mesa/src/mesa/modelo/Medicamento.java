package mesa.modelo;

public class Medicamento {
    private Integer id;
    private String nombre;
    private String laboratorio;
    private Integer cantidad;
    private Double precio;
    private Integer codigoNumero;

    public Medicamento(Integer id, String nombre, String laboratorio, Integer cantidad, Double precio, Integer codigoNumero) {
        this.id = id;
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigoNumero = codigoNumero;
    }

    //necesito dos constructores porque algunas veces no voy a tener un id
    //puede que el id no lo cargue yo, lo cargue la base de datos

    public Medicamento(String nombre, String laboratorio, Integer cantidad, Double precio, Integer codigoNumero) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigoNumero = codigoNumero;
    }

    @Override
    public String toString() {
        return "Medicamento: " +  + nombre + ", laboratorio: " + laboratorio + ", cantidad: " + cantidad + ", precio: " + precio + ", codigoNumero: " + codigoNumero + '.';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCodigoNumero() {
        return codigoNumero;
    }

    public void setCodigoNumero(Integer codigoNumero) {
        this.codigoNumero = codigoNumero;
    }
}
