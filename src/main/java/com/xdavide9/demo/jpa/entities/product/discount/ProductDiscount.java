package com.xdavide9.demo.jpa.entities.product.discount;

import com.xdavide9.demo.jpa.entities.product.Product;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "ProductDiscount")
@Table(name = "product_discount")
public class ProductDiscount {
    @EmbeddedId
    private ProductDiscountId productDiscountId;
    @Column(
            name = "amount",
            nullable = false,
            precision = 7,
            scale = 2
    )
    private BigDecimal amount;
    @ManyToOne(
            targetEntity = Product.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumn(
            name = "product_id",
            referencedColumnName = "product_id",
            foreignKey = @ForeignKey(
                    name = "billing_card_id_fkey"
            )
    )
    @MapsId("productId")
    private Product product;
    @ManyToOne(
            targetEntity = Discount.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumn(
            name = "discount_code",
            referencedColumnName = "discount_code",
            foreignKey = @ForeignKey(
                    name = "product_discount_discount_code_fkey"
            )
    )
    @MapsId("discountCode")
    private Discount discount;
}
