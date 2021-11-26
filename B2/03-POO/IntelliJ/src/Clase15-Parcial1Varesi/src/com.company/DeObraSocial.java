package com.company;


public class DeObraSocial extends Paciente implements Comparable{
    private String nombreObraSocial;
    private int numeroAsociado;
    private String matriculaNavegacion;

    public DeObraSocial(String fechaNacimiento, String nombre, String apellido, boolean esPimeraConsulta, String nombreObraSocial, int numeroAsociado, String matriculaNavegacion) {
        super();
        setFechaNacimiento(fechaNacimiento);
        setNombre(nombre);
        setApellido(apellido);
        setEsPimeraConsulta(esPimeraConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroAsociado = numeroAsociado;
        this.matriculaNavegacion = matriculaNavegacion;
    }

    @Override
    public int compareTo(Object o) {
        return  this.numeroAsociado - ((DeObraSocial)o).numeroAsociado;
    }

    public String getNombreObraSocial() {
        return nombreObraSocial;
    }

    public void setNombreObraSocial(String nombreObraSocial) {
        this.nombreObraSocial = nombreObraSocial;
    }

    public int getNumeroAsociado() {
        return numeroAsociado;
    }

    public void setNumeroAsociado(int numeroAsociado) {
        this.numeroAsociado = numeroAsociado;
    }

    public String getMatriculaNavegacion() {
        return matriculaNavegacion;
    }

    public void setMatriculaNavegacion(String matriculaNavegacion) {
        this.matriculaNavegacion = matriculaNavegacion;
    }

    @Override
    public String toString() {
        return super.toString() + " DeObraSocial{" +
                "nombreObraSocial='" + nombreObraSocial + '\'' +
                ", numeroAsociado=" + numeroAsociado +
                ", matriculaNavegacion='" + matriculaNavegacion + '\'' +
                '}';
    }
}

