package com.xdavide9.demo.product;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @SequenceGenerator(name = "product_sequence", sequenceName = "product_sequence", allocationSize = 1)
    @GeneratedValue(generator = "product_sequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "product_id")
    private Long productId;
    @Column(nullable = false)
    private String name, description;
    @Column(nullable = false)
    private Double price, averageRating;
    @Column(nullable = false)
    private Integer quantityInStock, quantitySold;
}
