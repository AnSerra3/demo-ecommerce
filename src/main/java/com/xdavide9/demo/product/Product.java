package com.xdavide9.demo.product;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(
        name = "product"
)
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_product_id_seq",
            sequenceName = "product_product_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_product_id_seq"
    )
    @Column(
            name = "product_id",
            updatable = false
    )
    private Long productId;
    @Column(
            name = "name",
            nullable = false
    )
    private String name;
    @Column(
            name = "category",
            nullable = false
    )
    private String category;
    @Column(
            name = "quantity_in_stock",
            nullable = false
    )
    private Integer quantityInStock;
    @Column(
            name = "quantity_sold",
            nullable = false
    )
    private Integer quantitySold;
    @Column(
            name = "description",
            nullable = false
    )
    private String description;
    @Column(
            name = "price",
            nullable = false,
            precision = 7,
            scale = 2
    )
    private BigDecimal price;
}
