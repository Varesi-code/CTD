package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Consulta consulta1 = new Consulta( "15/10/2021","Traumatología", 12, 30);
        Consulta consulta2 = new Consulta( "15/11/2021","Dentista", 17, 10);
        Consulta consulta3 = new Consulta( "16/12/2021","Ginecologia", 8, 45);

        Particular paciente1 = new Particular("16/12/2002", "Juan", "Perez", true, 4000, 23345667);
        DeObraSocial paciente2 = new DeObraSocial("16/12/1988", "Natalia", "Varesi", true, "Esencial", 345457, "nav345");
        DeObraSocial paciente3 = new DeObraSocial("8/09/1987", "Agostina", "Bianco", false, "OSDE", 458432, "nav347");

        paciente1.setConsulta(consulta1);
        paciente2.setConsulta(consulta2);
        paciente3.setConsulta(consulta3);

        if (paciente2.compareTo(paciente3) < 0) {
            System.out.println("La consulta del paciente " + paciente2.getNombre() + " " + paciente2.getApellido() + " es menor que la consulta de " + paciente3.getNombre() + " " + paciente3.getApellido());
        }
        else if (paciente2.compareTo(paciente3) > 0) {
            System.out.println("La consulta del paciente " + paciente2.getNombre() + " " + paciente2.getApellido() + " es mayor que la consulta de " + paciente3.getNombre() + " " + paciente3.getApellido());
        } else {
            System.out.println("La consulta del paciente " + paciente2.getNombre() + " " + paciente2.getApellido() + " es igual que la consulta de " + paciente3.getNombre() + " " + paciente3.getApellido());
        }

        System.out.println("------------------");

        System.out.println("El paciente "+ paciente1.getNombre() + " " + paciente1.getApellido() + (paciente1.siEvaluacionInicial() ? "" : " no" )+ " debe hacerse una evaluacion inicial.");
        System.out.println("El paciente "+ paciente2.getNombre() + " " + paciente2.getApellido() + (paciente2.siEvaluacionInicial() ? "" : " no" )+ " debe hacerse una evaluacion inicial.");
        System.out.println("El paciente "+ paciente3.getNombre() + " " + paciente3.getApellido() + (paciente3.siEvaluacionInicial() ? "" : " no" )+ " debe hacerse una evaluacion inicial.");

        System.out.println("------------------");

        System.out.println("El paciente "+ paciente1.getNombre() + " " + paciente1.getApellido() + " tiene una consulta el dia " + paciente1.getConsulta().getFechaConsulta());
        System.out.println("El paciente "+ paciente2.getNombre() + " " + paciente2.getApellido() + " tiene una consulta el dia " + paciente2.getConsulta().getFechaConsulta());
        System.out.println("El paciente "+ paciente3.getNombre() + " " + paciente3.getApellido() + " tiene una consulta el dia " + paciente3.getConsulta().getFechaConsulta());

        System.out.println("------------------");

        System.out.println(paciente1 + "\n" + paciente2 + "\n" + paciente3);



    }

}
