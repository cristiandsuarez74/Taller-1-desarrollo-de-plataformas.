package com.practica.postman.controllers;
import com.practica.postman.dto.EstudianteDto;
import com.practica.postman.services.estudianteService;
import com.practica.postman.model.estudianteEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.practica.postman.request.estudianteRequest;
import com.practica.postman.response.estudianteResponse;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("estu")
public class estudianteController {
    private final estudianteService estudianteSer;
    @GetMapping()
    public List<estudianteResponse> get(){
        return estudianteSer.obtenerTodos();
    }
    @PostMapping()
    public estudianteResponse crear(@RequestBody estudianteRequest estudiante){
        return estudianteSer.guardar(estudiante);
    }
    @GetMapping("{nombre}")
    public List<estudianteResponse> traer(@PathVariable String nombre){
        return estudianteSer.buscarPorNombre(nombre);

    }
    @DeleteMapping("{id}")
    public void delate(@PathVariable Long id) {

        estudianteSer.elimar(id);

    }
    @PutMapping("{id}")
    public estudianteResponse atc(@PathVariable Long id,@RequestBody estudianteRequest estudiante){
         return estudianteSer.actualizar(id,estudiante);
        }

}

