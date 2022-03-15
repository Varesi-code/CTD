package presencial.modelo;

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

    public Medicamento(String nombre, String laboratorio, Integer cantidad, Double precio, Integer codigoNumero) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigoNumero = codigoNumero;
    }

    @Override
    public String toString(){
        return "Medicamento: "+nombre+" - precio: "+precio;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getCodigoNumero() {
        return codigoNumero;
    }
}
