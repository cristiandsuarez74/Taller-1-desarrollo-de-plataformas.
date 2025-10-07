package com.practica.postman.mappers;

import com.practica.postman.model.estudianteEntity;
import com.practica.postman.model.ordenItemEntity;
import com.practica.postman.request.ordenItemRequest;
import com.practica.postman.response.ordenItemResponse;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel="spring")
public interface ordenItemMapper {
    ordenItemEntity toItem(ordenItemRequest request);



    ordenItemResponse toItemResponse(ordenItemEntity entity);



    List<ordenItemResponse> toItemResponseList(List<estudianteEntity> enti);
}
