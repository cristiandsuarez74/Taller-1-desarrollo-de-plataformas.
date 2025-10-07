package com.practica.postman.repositorys;

import com.practica.postman.model.ordenItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenItemRepository extends JpaRepository<ordenItemEntity,Long> {
}
