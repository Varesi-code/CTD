package com.dh.clase31.presencial.controller;


import com.dh.clase31.presencial.entities.Movimiento;
import com.dh.clase31.presencial.entities.Usuario;
import com.dh.clase31.presencial.service.MovimientoService;
import com.dh.clase31.presencial.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioService service;

        @GetMapping
        public ResponseEntity<List<Usuario>> traerUsuarios(){
            return ResponseEntity.ok(service.obtenerUsuarios());
        }

        @PostMapping("/guardar")
        public ResponseEntity<String> guardarUsuario(@RequestBody Usuario usuario){
            ResponseEntity<String> respuesta = null;
            if (service.guardarUsuario(usuario)!=null){
                respuesta = ResponseEntity.ok("Usuario guardado correctamente");
            }
            else{
                respuesta = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al guardar el usuario");
            }
            return respuesta;
        }
}
