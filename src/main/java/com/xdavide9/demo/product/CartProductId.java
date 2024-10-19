package com.xdavide9.demo.product;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Embeddable
public class CartProductId implements Serializable {
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "product_id")
    private Long productId;
}
