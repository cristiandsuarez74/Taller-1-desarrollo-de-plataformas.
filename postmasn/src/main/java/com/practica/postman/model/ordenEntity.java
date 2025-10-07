package com.practica.postman.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import com.practica.postman.model.ordenItemEntity;
@Entity
@Table(name = "orden")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ordenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  idOrden;

    @Column(name = "fecha",nullable = false)
    private LocalDateTime fecha;

    @Column(name = "total",nullable = false,length = 100)
    private Long total;



    @OneToMany(mappedBy = "orden", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ordenItemEntity> items;

}
