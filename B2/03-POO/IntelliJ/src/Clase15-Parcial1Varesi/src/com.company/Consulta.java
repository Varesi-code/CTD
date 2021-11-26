package com.company;


public class Consulta {
    private String fechaConsulta;
    private String especialidad;
    private int horaConsulta;
    private int minutosConsulta;

    public Consulta(String fechaConsulta, String especialidad, int horaConsulta, int minutosConsulta){
        this.fechaConsulta = fechaConsulta;
        this.especialidad = especialidad;
        this.horaConsulta = horaConsulta;
        this.minutosConsulta = minutosConsulta;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(int horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public int getMinutosConsulta() {
        return minutosConsulta;
    }

    public void setMinutosConsulta(int minutosConsulta) {
        this.minutosConsulta = minutosConsulta;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "fechaConsulta=" + fechaConsulta +
                ", especialidad='" + especialidad + '\'' +
                ", horaConsulta=" + horaConsulta +
                ":" + minutosConsulta +
                '}';
    }
}
