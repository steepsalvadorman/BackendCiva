package com.backend.football.demo.repository;

import com.backend.football.demo.model.entity.Futbolista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FutbolistaRepository extends JpaRepository<Futbolista, Long> {
}