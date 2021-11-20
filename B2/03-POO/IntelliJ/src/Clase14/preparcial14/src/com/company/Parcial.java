package com.company;

public class Parcial extends Examen {
    private int numeroUnidad;
    private int reintentos;

    public Parcial(String titulo, String enunciado, double nota, int numeroUnidad, int reintentos) {
        super();
        setTitulo(titulo);
        setEnunciado(enunciado);
        setNota(nota);
        this.numeroUnidad = numeroUnidad;
        this.reintentos = reintentos;
    }

    public boolean siRecuperar() {
        if (numeroUnidad <= 3) {
            return reintentos <= 3;
        } else {
            return reintentos <= 2;
        }
    }

    public int getNumeroUnidad() {
        return numeroUnidad;
    }

    public void setNumeroUnidad(int numeroUnidad) {
        this.numeroUnidad = numeroUnidad;
    }

    public int getReintentos() {
        return reintentos;
    }

    public void setReintentos(int reintentos) {
        this.reintentos = reintentos;
    }
}


