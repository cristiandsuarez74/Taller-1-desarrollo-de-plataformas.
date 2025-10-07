package com.practica.postman.services;


import com.practica.postman.model.estudianteEntity;
import com.practica.postman.dto.EstudianteDto;
import com.practica.postman.request.estudianteRequest;
import com.practica.postman.response.estudianteResponse;

import java.util.List;

public interface estudianteServiceInterface  {
    public List<estudianteResponse> obtenerTodos();
    public estudianteResponse guardar(estudianteRequest estudiante);
    public List<estudianteResponse> buscarPorNombre(String nombre);
    public void elimar(Long id);
    public estudianteResponse actualizar(Long id, estudianteRequest estudiante);
}
