package com.practica.postman.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.practica.postman.model.estudianteEntity;

import java.util.List;

@Repository
public interface estudianteRepository extends JpaRepository<estudianteEntity, Long> {
    List<estudianteEntity> findAllByNombre(String nombre);

}
