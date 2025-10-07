package com.practica.postman.services;

import com.practica.postman.request.ordenRequest;
import com.practica.postman.response.ordenResponse;

import java.util.List;

public interface ordenServiceInterface {
    public List<ordenResponse> obtner();
    public ordenResponse crear(ordenRequest request);
    public void eliminar(Long id);
}
