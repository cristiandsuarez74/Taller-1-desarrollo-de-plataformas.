package com.practica.postman.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class estudianteRequest {
    private String nombre;
    private int edad;
    private String correo;
    private String documento;
    private String telefono;

}
