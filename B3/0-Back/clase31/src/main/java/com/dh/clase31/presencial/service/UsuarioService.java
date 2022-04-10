package com.dh.clase31.presencial.service;

import com.dh.clase31.presencial.entities.Usuario;
import com.dh.clase31.presencial.repository.MovimientoRepository;
import com.dh.clase31.presencial.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository repository;

    public List<Usuario> obtenerUsuarios(){
        return repository.findAll();
    }

    public String guardarUsuario(Usuario usuario){
        repository.save(usuario);
        return "Usuario guardado";
    }
}
