package com.dh.integradora.service;

import com.dh.integradora.Entities.Paciente;

import java.util.List;

public interface PacienteServiceInterface {
    List<Paciente> listarPacientes();
    Paciente buscarXEmail(String email);

    //clase 25
    Paciente guardar(Paciente paciente);
    Paciente actualizar(Paciente paciente);

    Paciente buscar(int id);
    void eliminar(int id);
}
