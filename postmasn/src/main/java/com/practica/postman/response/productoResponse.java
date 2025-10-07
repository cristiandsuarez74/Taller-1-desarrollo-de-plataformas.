package com.practica.postman.response;

import lombok.Data;

import java.math.BigInteger;
@Data

public class productoResponse {

    private Long  idProducto;


    private String nombre;


    private Long valor;


    private BigInteger stock;
}
