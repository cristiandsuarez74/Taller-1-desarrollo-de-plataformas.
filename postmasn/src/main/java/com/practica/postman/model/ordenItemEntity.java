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
import java.math.BigInteger;
import jakarta.persistence.*;


@Entity
@Table(name = "OrdenItem")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ordenItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrdenItem;
    @Column(name = "cantidad",nullable = false,length = 100)
    private Long cantidad;

    @ManyToOne
    @JoinColumn(name = "orden_id",nullable = false)
    private ordenEntity orden;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id", nullable = false)
    private productoEntity producto;

}
