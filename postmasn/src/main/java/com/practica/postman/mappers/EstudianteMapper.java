package com.practica.postman.mappers;
import com.practica.postman.model.estudianteEntity;
import com.practica.postman.request.estudianteRequest;
import com.practica.postman.model.productoEntity;
import com.practica.postman.model.ordenEntity;
import com.practica.postman.model.ordenItemEntity;

import com.practica.postman.request.ordenItemRequest;
import com.practica.postman.request.ordenRequest;
import com.practica.postman.request.productoRequest;
import org.mapstruct.Mapper;
import com.practica.postman.response.estudianteResponse;
import org.mapstruct.Mapping;
import com.practica.postman.response.ordenItemResponse;
import com.practica.postman.response.ordenResponse;
import com.practica.postman.response.productoResponse;



import java.util.List;

@Mapper(componentModel="spring")
public interface EstudianteMapper {
    @Mapping(target = "idEstudiante", ignore = true)
    @Mapping(target = "fechaCreacion", ignore = true)
    estudianteEntity toEntity(estudianteRequest request);
    estudianteResponse toResponse(estudianteEntity entity);
    List<estudianteResponse> toResponseList(List<estudianteEntity> enti);






}
