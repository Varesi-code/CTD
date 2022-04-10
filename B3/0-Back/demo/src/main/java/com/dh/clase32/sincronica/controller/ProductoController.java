package com.dh.clase32.sincronica.controller;

import com.dh.clase32.sincronica.entities.Producto;
import com.dh.clase32.sincronica.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoService service;

    @GetMapping
    public ResponseEntity traerProductos(){
        return ResponseEntity.ok(service.obtenerProductos());
    }

    @PostMapping("/crear")
    public ResponseEntity<String> crear(@RequestBody Producto p){
        ResponseEntity<String> respuesta = null;
        if(service.guardarProducto(p)!=null){
            respuesta = ResponseEntity.ok("Producto creado");
        }
        else {
            respuesta = ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No se pudo crear el producto");
        }
        return respuesta;
}

}
