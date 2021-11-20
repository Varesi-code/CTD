package com.company;

public class Final extends Examen implements Comparable{
    private double notaOral;
    private String tema;

    @Override
    public int compareTo(Object o) {
        //return tema.compareTo(((Final)o).getTema());

        if(this.notaPromedio() < ((Final)o).notaPromedio()){
            return -1;
        }
        if(this.notaPromedio() > ((Final)o).notaPromedio()) {
            return 1;
        }
        return 0;
    }


    public double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    public double notaPromedio(){
        return (this.notaOral+super.getNota())/2;
    }
}
