package com.xdavide9.demo.user;

import com.xdavide9.demo.product.Product;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "PurchaseHistory")
@Table(name = "purchase_history")
public class PurchaseHistory {
    @EmbeddedId
    private PurchaseHistoryId purchaseHistoryId;
    @Column(
            name = "quantity",
            nullable = false
    )
    private Integer quantity;
    @ManyToOne(
            targetEntity = Address.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumns(
            value = {
                    @JoinColumn(
                            name = "postal_code",
                            referencedColumnName = "postal_code"
                    ),
                    @JoinColumn(
                            name = "street",
                            referencedColumnName = "street"
                    )
            }
    )
    private Address address;
    @ManyToOne(
            targetEntity = Product.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumn(
            name = "product_id",
            referencedColumnName = "product_id",
            foreignKey = @ForeignKey(
                    name = "purchase_history_product_id_fkey"
            )
    )
    private Product product;
    @ManyToOne(
            targetEntity = User.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "user_id"
    )
    private User user;
    @ManyToOne(
            targetEntity = Card.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumn(
            name = "card_id",
            referencedColumnName = "card_id"
    )
    private Card card;
}
