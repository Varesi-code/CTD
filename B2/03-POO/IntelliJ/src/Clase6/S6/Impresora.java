package Clase6.S6;

import java.util.Date;
import java.util.Scanner;

public class Impresora {
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int cantidadHojas;

    Impresora(String modelo, String tipoConexion){
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = new Date();
        this.cantidadHojas = 100;
    }

    public boolean tienePapel(){
        return this.cantidadHojas > 0;
    }

    public boolean imprimir(String texto){
        if(this.tienePapel()){
            System.out.println(texto + ". ✅✅ Impresion Terminada!");
            this.cantidadHojas--;
            return true;

        }else {
            System.out.println(" ‼️ No hay papel ️");
            return false;
        }
    }

    public int agregarPapel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de hojas que desea agregar: ");
        int numero = scanner.nextInt();
        return cantidadHojas += numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }
}
