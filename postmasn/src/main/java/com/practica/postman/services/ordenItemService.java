package com.practica.postman.services;

import com.practica.postman.mappers.productoMapper;

import com.practica.postman.repositorys.OrdenItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ordenItemService {
    private final productoMapper mapper;
    private final OrdenItemRepository item;
}
