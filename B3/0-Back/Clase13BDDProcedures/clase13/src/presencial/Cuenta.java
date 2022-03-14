package presencial;

public class Cuenta {
    private int id;
    private int nroCuenta;
    private String nombre;
    private double saldo;

    public Cuenta(int id, int nroCuenta, String nombre, double saldo) {
        this.id = id;
        this.nroCuenta = nroCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }
}
