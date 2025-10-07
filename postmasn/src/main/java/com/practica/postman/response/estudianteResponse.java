package com.practica.postman.response;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class estudianteResponse {
    private Long idEstudiante;
    private String nombre;
    private Integer edad;
    private String correo;
    private String documento;
    private String telefono;
    private LocalDateTime fechaCreacion;
}
