package com.proyecto.bibliotec.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    // Se guarda cifrada con BCrypt
    @Column(nullable = false)
    private String password;

    private String rol = "USER";

    // Relación muchos a muchos: un usuario marca muchos libros como favoritos
    // y un libro puede ser favorito de muchos usuarios (tabla intermedia "favoritos")
    @ManyToMany
    @JoinTable(
            name = "favoritos",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id"))
    @JsonIgnore
    private Set<Libro> favoritos = new HashSet<>();
}
