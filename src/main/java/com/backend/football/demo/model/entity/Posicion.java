package com.backend.football.demo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Posicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
}