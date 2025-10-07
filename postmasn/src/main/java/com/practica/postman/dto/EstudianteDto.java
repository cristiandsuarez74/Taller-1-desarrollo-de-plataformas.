package com.practica.postman.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteDto {
    private Long idEstudiante;
    private String nombre;
    private int edad;
    private String correo;
    private String documento;
}
