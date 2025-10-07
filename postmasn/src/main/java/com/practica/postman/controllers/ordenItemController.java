package com.practica.postman.controllers;

import com.practica.postman.services.ordenItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("ordenItem")
public class ordenItemController {
    private final ordenItemService service;
}
