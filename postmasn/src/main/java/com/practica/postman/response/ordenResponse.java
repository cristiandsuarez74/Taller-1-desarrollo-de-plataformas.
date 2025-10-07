package com.practica.postman.response;



import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ordenResponse {
    private Long  idOrden;


    private LocalDateTime fecha;


    private Long total;
}
