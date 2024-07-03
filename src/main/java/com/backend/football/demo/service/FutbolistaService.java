package com.backend.football.demo.service;

import com.backend.football.demo.exception.ResourceNotFoundException;
import com.backend.football.demo.model.entity.Futbolista;
import com.backend.football.demo.repository.FutbolistaRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class FutbolistaService {

    private final FutbolistaRepository futbolistaRepository;

    public Page<Futbolista> findAll(Pageable pageable) {
        return futbolistaRepository.findAll(pageable);
    }

    public Futbolista findById(Long id) {
        return futbolistaRepository
                .findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }
}
