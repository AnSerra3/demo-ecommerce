package com.xdavide9.demo.product;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ProductDiscountId {
    @Column(
            name = "product_id",
            insertable = false,
            updatable = false
    )
    private Long productId;
    @Column(
            name = "discount_code",
            insertable = false,
            updatable = false
    )
    private String discountCode;
}
