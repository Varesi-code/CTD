package com.dh.odontologo.controller;

import com.dh.odontologo.domain.Odontologo;
import com.dh.odontologo.service.OdontologoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OdontologoController {

   private final OdontologoServiceInterface odontologoService;

   @Autowired
   public OdontologoController(OdontologoServiceInterface odontologoService) {
      this.odontologoService = odontologoService;
   }

   @GetMapping("/odontologos")
   public List<Odontologo> getOdontologos(){
      return odontologoService.listaOdontologos ();
   }
}

