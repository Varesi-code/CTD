package Clase6.M6;

import java.time.LocalDate;

public class Perro {
    private String nombre;
    private boolean enAdopcion;
    private String raza;
    private Double peso;
    private boolean chip;
    private LocalDate anioNacimiento;
    private boolean lastimado;

    public Perro (String nombre, boolean enAdopcion ) {
        this.nombre = nombre;
        this.enAdopcion = enAdopcion;
        this.raza = "Ns";
        this.peso = 5.0;
        this.chip = false;
        this.anioNacimiento = LocalDate.of(2009,9,17);
        this.lastimado = false;
    }

    public Perro (boolean lastimado, boolean chip, boolean enAdopcion, String raza){
        this.lastimado = lastimado;
        this.chip = chip;
        this.enAdopcion = enAdopcion;
        this.raza = raza;
        this.nombre = "Ns";
        this.peso = 5.0;
        this.anioNacimiento =  LocalDate.of(2009,9,17);
    }

    public LocalDate calcularEdad() {
        return getYear(LocalDate.now().minusYears(anioNacimiento.getYear()));
    }

    public void sePuedePerder(){
        if(this.chip) {
            System.out.println("No se puede perder");
        }
        else {
            System.out.println("Se puede perder");
        }
    }

    public void enviarAdopcion(){
        if(this.lastimado && this.peso > 5.0) {
            System.out.println("Se puede enviar a adopcion");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEnAdopcion() {
        return enAdopcion;
    }

    public void setEnAdopcion(boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public LocalDate getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(LocalDate anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public boolean isLastimado() {
        return lastimado;
    }

    public void setLastimado(boolean lastimado) {
        this.lastimado = lastimado;
    }
}
