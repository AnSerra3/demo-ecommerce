package com.xdavide9.demo.jpa.entities.product.wishlist;

import com.xdavide9.demo.jpa.entities.product.Product;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "ProductWishlist")
@Table(name = "product_wishlist")
public class ProductWishlist {
    @EmbeddedId
    private ProductWishlistId productWishlistId;
    @ManyToOne(
            targetEntity = Product.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumn(
            name = "product_id",
            referencedColumnName = "product_id",
            foreignKey = @ForeignKey(
                    name = "product_wishlist_product_id_fkey"
            )
    )
    @MapsId("productId")
    private Product product;
    @ManyToOne(
            targetEntity = Wishlist.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumn(
            name = "wishlist_id",
            referencedColumnName = "wishlist_id",
            foreignKey = @ForeignKey(
                    name = "product_wishlist_wishlist_id_fkey"
            )
    )
    @MapsId("wishlistId")
    private Wishlist wishlist;
}
