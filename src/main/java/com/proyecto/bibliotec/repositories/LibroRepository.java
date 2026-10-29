package com.proyecto.bibliotec.repositories;

import com.proyecto.bibliotec.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}