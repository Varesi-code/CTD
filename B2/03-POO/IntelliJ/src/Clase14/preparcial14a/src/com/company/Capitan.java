package com.company;

public class Capitan {
    private String nombre;
    private String apellido;
    private String matriculaNavegacion;

    public Capitan(String nombre, String apellido, String matriculaNavegacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
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

    public String getMatriculaNavegacion() {
        return matriculaNavegacion;
    }

    public void setMatriculaNavegacion(String matriculaNavegacion) {
        this.matriculaNavegacion = matriculaNavegacion;
    }

    @Override
    public String toString() {
        return "Capitan{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", matriculaNavegacion='" + matriculaNavegacion + '\'' +
                '}';
    }
}
