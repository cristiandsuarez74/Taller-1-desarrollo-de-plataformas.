package com.practica.postman.repositorys;
import org.springframework.data.jpa.repository.JpaRepository;
import com.practica.postman.model.productoEntity;

import com.practica.postman.model.estudianteEntity;

public interface productoRepository extends JpaRepository<productoEntity, Long>{

}
