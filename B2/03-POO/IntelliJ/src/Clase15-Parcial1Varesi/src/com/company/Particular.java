package com.company;

import java.util.Date;

public class Particular extends Paciente{
    private double costoConsulta;
    private int dni;

    public Particular( String fechaNacimiento, String nombre, String apellido, boolean esPimeraConsulta, double costoConsulta, int dni) {
        super();
        setFechaNacimiento(fechaNacimiento);
        setNombre(nombre);
        setApellido(apellido);
        setEsPimeraConsulta(esPimeraConsulta);
        this.costoConsulta = costoConsulta;
        this.dni = dni;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }

    public void setCostoConsulta(double costoConsulta) {
        this.costoConsulta = costoConsulta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return super.toString() +" Particular{" +
                "costoConsulta=" + costoConsulta +
                ", dni=" + dni +
                '}';
    }
}
