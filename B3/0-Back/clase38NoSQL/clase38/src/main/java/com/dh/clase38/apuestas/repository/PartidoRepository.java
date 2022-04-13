package com.dh.clase38.apuestas.repository;

import com.dh.clase38.apuestas.model.Partido;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidoRepository extends MongoRepository<Partido,Long> {
}
