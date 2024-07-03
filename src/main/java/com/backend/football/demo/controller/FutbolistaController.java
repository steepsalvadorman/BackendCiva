package com.backend.football.demo.controller;

import com.backend.football.demo.model.entity.Futbolista;
import com.backend.football.demo.service.FutbolistaService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/futbolista")
public class FutbolistaController {

    private final FutbolistaService futbolistaService;

    @GetMapping
    public Page<Futbolista> getFutbolistas(@PageableDefault(page = 0, size = 5) Pageable pageable) {
        return futbolistaService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public Futbolista get(@PathVariable Long id) {
        return futbolistaService.findById(id);
    }
}
