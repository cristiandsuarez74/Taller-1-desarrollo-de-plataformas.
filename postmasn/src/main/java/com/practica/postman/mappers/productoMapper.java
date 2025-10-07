package com.practica.postman.mappers;
import com.practica.postman.model.productoEntity;
import com.practica.postman.response.productoResponse;
import com.practica.postman.request.productoRequest;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel="spring")
public interface productoMapper {

    productoEntity toProductoEntity(productoRequest request);
    productoResponse toProductoResponse(productoEntity entity);
    List<productoResponse> toPoductoResponseList(List<productoEntity> enti);
}
