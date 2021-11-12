package Clase11.M11;

public abstract class Cuenta {
    private double saldo;
    private Cliente cliente;

    public Cuenta(Cliente cliente){
        this.cliente = cliente;
        saldo = 100.00;
    }

    public Cuenta(Cliente cliente, double saldo){
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public abstract void depositar(double monto);

    public abstract void extraer(double monto);

    public void informarSaldo(){
        System.out.println("Saldo: " +  getSaldo());
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
