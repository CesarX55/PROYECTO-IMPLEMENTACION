package com.proyecto.bibliotec.controllers;

import com.proyecto.bibliotec.models.Libro;
import com.proyecto.bibliotec.repositories.LibroRepository;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/{id}")
    public ResponseEntity<Libro> obtenerPorId(@PathVariable Long id) {
        return libroRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Libro crear(@RequestBody Libro libro) {
        return libroRepository.save(libro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Libro> actualizar(@PathVariable Long id, @RequestBody Libro libro) {
        if (!libroRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        libro.setId(id);
        return ResponseEntity.ok(libroRepository.save(libro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (!libroRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        libroRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}