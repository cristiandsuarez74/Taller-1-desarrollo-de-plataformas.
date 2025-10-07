package com.practica.postman.mappers;

import com.practica.postman.model.ordenEntity;
import com.practica.postman.request.ordenRequest;
import com.practica.postman.response.ordenResponse;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel="spring")
public interface ordenMapper {
    ordenEntity toOrdenEntity(ordenRequest request);
    ordenResponse toOrdenResponse(ordenEntity entity);
    List<ordenResponse> toOrdenResponseList(List<ordenEntity> enti);

}
