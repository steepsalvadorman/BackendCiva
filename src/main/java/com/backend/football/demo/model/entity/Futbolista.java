package com.backend.football.demo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Data
public class Futbolista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    private String caracteristicas;

    @ManyToOne
    @JoinColumn(name = "posicion_id")
    private Posicion posicion;
}