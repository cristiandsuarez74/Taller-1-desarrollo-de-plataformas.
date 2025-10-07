package com.practica.postman.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;
import java.time.LocalDateTime;


import java.util.Date;


@Entity
@Table(name = "estudiante")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class estudianteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstudiante;
    @Column(name = "nombre_estudiante",nullable = false,length = 100)
    private String nombre;
    @Column(name = "edad",nullable = false)
    private Integer edad;
    @Column(name = "correo_electronico",nullable=false,length = 100)
    private String correo;
    @Column(name = "documento",nullable = false,length = 100,unique = true)
    private String documento;
    @Column(name = "telefono", length = 20)
    private String telefono;

    // Nuevo campo fecha de creación (puede ser null)
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;





}
