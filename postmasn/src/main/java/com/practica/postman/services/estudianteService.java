package com.practica.postman.services;

import com.practica.postman.dto.EstudianteDto;
import com.practica.postman.mappers.EstudianteMapper;
import com.practica.postman.request.estudianteRequest;
import com.practica.postman.repositorys.estudianteRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.practica.postman.model.estudianteEntity;
import org.springframework.ui.Model;
import com.practica.postman.response.estudianteResponse;


import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class estudianteService implements estudianteServiceInterface {
    private final EstudianteMapper mapper;
    private final estudianteRepository estudianteRepo;



    @Override
    public List<estudianteResponse> obtenerTodos() {

        List<estudianteEntity> estudiante= estudianteRepo.findAll();


        return mapper.toResponseList(estudiante);
    }

    @Override
    public estudianteResponse guardar(estudianteRequest estudiante){
        estudianteEntity est =mapper.toEntity(estudiante);
        estudianteEntity guardado=estudianteRepo.save(est);
        return mapper.toResponse(guardado);


    }
    @Override
    public List<estudianteResponse> buscarPorNombre(String nombre){
        List<estudianteEntity> est= estudianteRepo.findAllByNombre(nombre);
        return mapper.toResponseList(est);

    }
    @Override
    public void elimar(Long id){
         estudianteRepo.deleteById(id);
    }

    @Override
    public estudianteResponse actualizar(Long id, estudianteRequest estudiante){
        var estudianteUpdate = estudianteRepo.findById(id);
        estudianteEntity enti =estudianteUpdate.get();
        enti.setCorreo(estudiante.getCorreo());
        enti.setEdad(estudiante.getEdad());
        enti.setDocumento(estudiante.getDocumento());
        enti.setNombre(estudiante.getNombre());


        estudianteEntity actualizado = estudianteRepo.save(enti);




        return mapper.toResponse(actualizado);

    }



}
