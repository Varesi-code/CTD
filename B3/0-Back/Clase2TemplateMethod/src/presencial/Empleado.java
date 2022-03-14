package presencial;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String numeroDeCuenta;

    public Empleado(String nombre, String apellido, String numeroDeCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getNombre(){
        return nombre;
    }
    };

