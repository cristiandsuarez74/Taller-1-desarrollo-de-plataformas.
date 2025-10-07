package com.practica.postman.services;

import com.practica.postman.mappers.ordenMapper;
import com.practica.postman.mappers.productoMapper;
import com.practica.postman.model.ordenEntity;
import com.practica.postman.repositorys.ordenRepository;
import com.practica.postman.request.ordenRequest;
import com.practica.postman.response.ordenResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ordenService implements ordenServiceInterface {
    private final ordenMapper mapper;
    private final ordenRepository orden;
    @Override
    public List<ordenResponse> obtner(){
         List<ordenEntity> obt = orden.findAll();
         return mapper.toOrdenResponseList(obt);



    }

    @Override
    public ordenResponse crear(ordenRequest request){
        ordenEntity enti = mapper.toOrdenEntity(request);
        ordenEntity guardar=orden.save(enti);
        return mapper.toOrdenResponse(guardar);

    }
    @Override
     public void eliminar(Long id){
        orden.deleteById(id);
     }

}
