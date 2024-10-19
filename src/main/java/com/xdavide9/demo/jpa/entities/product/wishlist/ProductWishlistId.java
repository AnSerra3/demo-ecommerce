package com.xdavide9.demo.jpa.entities.product.wishlist;

import lombok.*;

import java.io.Serializable;

@ToString
@EqualsAndHashCode
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductWishlistId implements Serializable {
    private Long productId;
    private Long wishlistId;
}
