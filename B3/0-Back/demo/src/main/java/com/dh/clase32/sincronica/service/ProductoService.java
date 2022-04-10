package com.dh.clase32.sincronica.service;

import com.dh.clase32.sincronica.entities.Producto;
import com.dh.clase32.sincronica.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository repository;

    public String guardarProducto(Producto p){
        repository.save(p);
        return "Producto guardado";
    }

    public List<Producto> obtenerProductos(){
        return repository.findAll();
    }
}
