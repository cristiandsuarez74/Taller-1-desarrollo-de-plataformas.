package com.practica.postman.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class productoEntity {
    @Id
    @SequenceGenerator(name = "producto_seq_gen", sequenceName = "producto_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "producto_seq_gen")
    private Long idProducto;

    @Column(name = "nombre",nullable = false,length = 100)
    private String nombre;

    @Column(name = "valor",nullable = false,length = 100)
    private Long valor;

    @Column(name = "stock",nullable = false,length = 100)
    private BigInteger stock;
    @OneToMany(mappedBy = "producto")
    private List<ordenItemEntity> ordenItems;


}
