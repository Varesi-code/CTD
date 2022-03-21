package Presencial.modelo;

public class Domicilio {
    private String calle,localidad,provincia;
    private Integer numero,id;

    public Domicilio(String calle, String localidad, String provincia, Integer numero, Integer id) {
        this.calle = calle;
        this.localidad = localidad;
        this.provincia = provincia;
        this.numero = numero;
        this.id = id;
    }

    public Domicilio(String calle, String localidad, String provincia, Integer numero) {
        this.calle = calle;
        this.localidad = localidad;
        this.provincia = provincia;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Domicilio: { " +'\'' +
                "calle= " + calle + '\'' +
                ", localidad= " + localidad + '\'' +
                ", provincia= " + provincia + '\'' +
                ", numero= " + numero +
                ", id= " + id +"}";
    }
}
