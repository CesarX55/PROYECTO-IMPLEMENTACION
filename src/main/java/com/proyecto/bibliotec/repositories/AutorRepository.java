package com.proyecto.bibliotec.repositories;

import com.proyecto.bibliotec.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}