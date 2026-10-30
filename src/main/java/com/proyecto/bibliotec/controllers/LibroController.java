package com.proyecto.bibliotec.controllers;

import com.proyecto.bibliotec.models.Libro;
import com.proyecto.bibliotec.repositories.LibroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroRepository libroRepository;

    public LibroController(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    @GetMapping
    public List<Libro> obtenerTodos() {
        return libroRepository.findAll();
    }

    @PostMapping
    public Libro crear(@RequestBody Libro libro) {
        return libroRepository.save(libro);
    }
}