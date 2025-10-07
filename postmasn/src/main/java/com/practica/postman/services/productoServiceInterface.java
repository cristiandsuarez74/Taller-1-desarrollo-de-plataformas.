package com.practica.postman.services;

import com.practica.postman.request.productoRequest;
import com.practica.postman.response.productoResponse;

import java.util.List;

public interface productoServiceInterface {
    public List<productoResponse> obtener();
    public productoResponse obtenerPorId(Long id);
    public productoResponse crear(productoRequest request);
    public void elimar(Long id);
    productoResponse actual(Long id, productoRequest request);
}
