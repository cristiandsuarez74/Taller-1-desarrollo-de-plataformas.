package com.practica.postman.controllers;

import com.practica.postman.request.ordenRequest;
import com.practica.postman.response.ordenResponse;
import com.practica.postman.services.ordenService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("orden")
public class ordenController {

    private final ordenService orden;
    @GetMapping()
    public List<ordenResponse> obtener(){
        return orden.obtner();

    }
    @PostMapping()
    public ordenResponse guardar(@RequestBody ordenRequest request){
        return orden.crear(request);
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable Long id){
        orden.eliminar(id);
    }
}

