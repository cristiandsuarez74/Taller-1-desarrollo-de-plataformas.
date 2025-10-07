package com.practica.postman.request;

import jakarta.persistence.Column;
import lombok.Data;

import java.math.BigInteger;
@Data

public class productoRequest {


    private String nombre;


    private Long valor;


    private BigInteger stock;
}
