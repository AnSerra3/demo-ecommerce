package com.xdavide9.demo.entities.product.cart;

import com.xdavide9.demo.entities.product.Product;
import com.xdavide9.demo.entities.user.User;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "CartProduct")
@Table(
        name = "cart_product"
)
public class CartProduct {
    @EmbeddedId
    private CartProductId cartProductId;
    @ManyToOne(
            targetEntity = User.class,
            optional = false,
            cascade = {jakarta.persistence.CascadeType.PERSIST}
    )
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "user_id",
            foreignKey = @ForeignKey(
                    name = "cart_product_user_id_fkey"
            )
    )
    @MapsId("userId")
    private User user;
    @ManyToOne(
            targetEntity = Product.class,
            optional = false,
            cascade = {jakarta.persistence.CascadeType.PERSIST}
    )
    @JoinColumn(
            name = "product_id",
            referencedColumnName = "product_id",
            foreignKey = @ForeignKey(
                    name = "cart_product_product_id_fkey"
            )
    )
    @MapsId("productId")
    private Product product;
    @Column(
            name = "quantity",
            nullable = false
    )
    private Integer quantity;
}
