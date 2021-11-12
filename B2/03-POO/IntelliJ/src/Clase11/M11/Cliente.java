package Clase11.M11;

public class Cliente {
    private int numeroClientes;
    private String apellido;
    private String dni;
    private String cuit;

    public Cliente(int numeroClientes, String apellido, String dni, String cuit) {
        this.numeroClientes = numeroClientes;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }



    public int getNumeroClientes() {
        return numeroClientes;
    }

    public void setNumeroClientes(int numeroClientes) {
        this.numeroClientes = numeroClientes;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
}
