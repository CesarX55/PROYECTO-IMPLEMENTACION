package com.proyecto.bibliotec.repositories;

import com.proyecto.bibliotec.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
