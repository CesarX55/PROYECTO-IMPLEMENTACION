package com.proyecto.bibliotec.controllers;

import com.proyecto.bibliotec.models.Autor;
import com.proyecto.bibliotec.repositories.AutorRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    private final AutorRepository repository;

    public AutorController(AutorRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Autor> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Autor crear(@RequestBody Autor autor) {
        return repository.save(autor);
    }
}
