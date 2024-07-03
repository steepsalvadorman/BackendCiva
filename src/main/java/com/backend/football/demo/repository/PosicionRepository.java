package com.backend.football.demo.repository;

import com.backend.football.demo.model.entity.Posicion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosicionRepository extends JpaRepository<Posicion, Long> {
}
