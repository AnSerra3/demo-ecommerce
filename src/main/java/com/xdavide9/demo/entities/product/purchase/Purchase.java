package com.xdavide9.demo.entities.product.purchase;

import com.xdavide9.demo.entities.user.billing.Address;
import com.xdavide9.demo.entities.user.billing.Card;
import com.xdavide9.demo.entities.user.User;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "Purchase")
@Table(
        name = "purchase"
)
public class Purchase {

    @EmbeddedId
    private PurchaseId purchaseId;
    @ManyToOne(
            targetEntity = User.class,
            optional = false,
            cascade = {jakarta.persistence.CascadeType.PERSIST}
    )
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "user_id",
            foreignKey = @jakarta.persistence.ForeignKey(
                    name = "purchase_user_id_fkey"
            )
    )
    private User user;
    @ManyToOne(
            targetEntity = Address.class,
            optional = false,
            cascade = {jakarta.persistence.CascadeType.PERSIST}
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
            },
            foreignKey = @ForeignKey(
                    name = "purchase_street_postal_code_fkey"
            )
    )
    private Address address;
    @ManyToOne(
            targetEntity = Card.class,
            optional = false,
            cascade = {jakarta.persistence.CascadeType.PERSIST}
    )
    @JoinColumn(
            name = "card_id",
            referencedColumnName = "card_id",
            foreignKey = @ForeignKey(
                    name = "purchase_card_id_fkey"
            )
    )
    private Card card;

}
