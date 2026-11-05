package com.proyecto.bibliotec.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "libros")
@Getter
@Setter
@NoArgsConstructor
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    @JsonIgnoreProperties("libros")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    @JsonIgnoreProperties("libros")
    private Autor autor;
}