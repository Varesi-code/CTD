package com.dh.odontologo.domain;

public class Odontologo {
   private int idOdontologo;
   private int matricula;
   private String nombre;
   private String apellido;

   public Odontologo () {
   }

   public Odontologo (int idOdontologo, int matricula, String nombre, String apellido) {
      this.idOdontologo = idOdontologo;
      this.matricula = matricula;
      this.nombre = nombre;
      this.apellido = apellido;
   }

   public Odontologo (int idOdontologo, String nombre) {
      this.idOdontologo = idOdontologo;
      this.nombre = nombre;
   }

   public int getMatricula () {
      return matricula;
   }

   public void setMatricula (int matricula) {
      this.matricula = matricula;
   }

   public String getApellido () {
      return apellido;
   }

   public void setApellido (String apellido) {
      this.apellido = apellido;
   }

   public int getIdOdontologo () {
      return idOdontologo;
   }

   public void setIdOdontologo (int idOdontologo) {
      this.idOdontologo = idOdontologo;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   @Override
   public String toString () {
      return "\n" + "Odontologo { "
            + "ID:" + idOdontologo
            + " · Matricula:" + matricula
            + " · Nombre y Apellido: " + nombre + " " + apellido + " }";
   }

}
