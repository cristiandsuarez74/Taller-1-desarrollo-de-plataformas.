package com.practica.postman.controllers;

import com.practica.postman.request.productoRequest;
import com.practica.postman.response.productoResponse;
import com.practica.postman.services.productoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("producto")
public class productoController {
    private final productoService service;

    @GetMapping()
    public List<productoResponse> obtener(){
        return service.obtener();
    }
    @GetMapping("{id}")
    public productoResponse traer(@PathVariable Long id){
        return service.obtenerPorId(id);
    }
    @PostMapping()
    public productoResponse guardar(@RequestBody productoRequest request){
        return service.crear(request);
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable Long id){
        service.elimar(id);
    }
    @PutMapping("{id}")
       public productoResponse atc(@PathVariable Long id,@RequestBody productoRequest product) {
        return service.actual(id, product);
    }


}
