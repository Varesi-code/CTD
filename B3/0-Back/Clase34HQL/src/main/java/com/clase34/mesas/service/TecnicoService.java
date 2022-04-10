package com.clase34.mesas.service;


import com.clase34.mesas.entities.Veterinaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnicoService {

    @Autowired
    VeterinariaRepository repository;

}
