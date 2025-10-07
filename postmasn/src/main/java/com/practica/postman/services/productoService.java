package com.practica.postman.services;


import com.practica.postman.mappers.productoMapper;
import com.practica.postman.model.productoEntity;
import com.practica.postman.repositorys.productoRepository;
import com.practica.postman.request.productoRequest;
import com.practica.postman.response.productoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class productoService implements productoServiceInterface{
    private final productoMapper mapper;
    private final productoRepository producto;

    @Override
    public List<productoResponse> obtener(){

        List<productoEntity> product= producto.findAll();
        return mapper.toPoductoResponseList(product);

    }
    @Override
    public productoResponse obtenerPorId(Long id) {
        productoEntity product = producto.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con ID: " + id));
        return mapper.toProductoResponse(product);
    }
    @Override
    public productoResponse crear(productoRequest request){
        productoEntity enti = mapper.toProductoEntity(request);
        productoEntity guardar=producto.save(enti);
        return mapper.toProductoResponse(guardar);

    }
    @Override
       public void elimar(Long id){
     producto.deleteById(id);
       }
       @Override
       public productoResponse actual(Long id, productoRequest req) {
           // 1. Buscar el producto existente
            var productoUpdate = producto.findById(id);
            productoEntity productoExistente= productoUpdate.get();

           productoExistente.setNombre(req.getNombre());
           productoExistente.setValor(req.getValor());
           productoExistente.setStock(req.getStock());

           productoEntity productoActualizado = producto.save(productoExistente);
           return mapper.toProductoResponse(productoActualizado);
       }

}
