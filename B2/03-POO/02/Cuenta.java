public class Cuenta {
    
    private int numeroDeCuenta;
    static private Double saldo;

    public Cuenta(int numeroDeCuenta, Double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        Cuenta.saldo = saldo;
    }
    //crear la funcion depositar y retirar aca
    public void deposito(Double cantidadDinero){
        saldo += cantidadDinero;
    }
    public void extraccion(Double cantidadDinero){
        if (saldo >= cantidadDinero){
            saldo -= cantidadDinero;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    //no tocar estas funciones
    public void setSaldo(Double saldo) {
        Cuenta.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }
}