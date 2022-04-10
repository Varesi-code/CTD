package com.dh.clase32.sincronica.repository;

import com.dh.clase32.sincronica.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
