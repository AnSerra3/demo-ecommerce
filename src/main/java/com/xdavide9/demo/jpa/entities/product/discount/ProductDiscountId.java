package com.xdavide9.demo.jpa.entities.product.discount;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ProductDiscountId implements Serializable {
    @Column(
            name = "product_id"
    )
    private Long productId;
    @Column(
            name = "discount_code"
    )
    private String discountCode;
}
