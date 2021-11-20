package com.company;

import java.util.Date;

public abstract class Paciente {
    private Consulta consulta;
    private String fechaNacimiento;
    private String nombre;
    private String apellido;
    private boolean esPimeraConsulta;

    public boolean siEvaluacionInicial(){
        return esPimeraConsulta;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isEsPimeraConsulta() {
        return esPimeraConsulta;
    }

    public void setEsPimeraConsulta(boolean esPimeraConsulta) {
        this.esPimeraConsulta = esPimeraConsulta;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "consulta=" + consulta +
                ", fechaNacimiento=" + fechaNacimiento +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", esPimeraConsulta=" + esPimeraConsulta +
                '}';
    }

}
