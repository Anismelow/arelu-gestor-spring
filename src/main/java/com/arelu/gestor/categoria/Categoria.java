package com.arelu.gestor.categoria;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categoria")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    @Setter
    private String nombre;

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

}

