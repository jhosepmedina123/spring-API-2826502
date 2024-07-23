package org.productos.java.productos2026502.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name='products')

public class Product {
    private Long id;
    private String nombre;
    private Double precio;

    

}
