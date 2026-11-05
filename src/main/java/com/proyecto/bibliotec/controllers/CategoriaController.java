package com.proyecto.bibliotec.controllers;

import com.proyecto.bibliotec.models.Categoria;
import com.proyecto.bibliotec.repositories.CategoriaRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaRepository repository;

    public CategoriaController(CategoriaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Categoria> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Categoria crear(@RequestBody Categoria categoria) {
        return repository.save(categoria);
    }
}
