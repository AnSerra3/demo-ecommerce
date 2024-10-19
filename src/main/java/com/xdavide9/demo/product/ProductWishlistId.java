package com.xdavide9.demo.product;

import lombok.*;

@ToString
@EqualsAndHashCode
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductWishlistId {
    private Long productId;
    private Long wishlistId;
}
