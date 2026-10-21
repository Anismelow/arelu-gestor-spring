package com.arelu.gestor.venta;

import com.arelu.gestor.categoria.Categoria;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "venta")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false)
    private LocalDate fecha;

    @Setter
    @Column(nullable = false, length = 255)
    private String descripcion;

    @Setter
    @Column(nullable = false)
    private Integer cantidad;

    @Setter
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal importe;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

    @Setter
    @Column(columnDefinition = "TEXT")
    private String notas;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime creadoEn;

    public Venta(LocalDate fecha, String descripcion, Integer cantidad,
                 BigDecimal importe, Categoria categoria) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.importe = importe;
        this.categoria = categoria;
    }
}