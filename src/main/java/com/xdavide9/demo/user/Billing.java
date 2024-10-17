package com.xdavide9.demo.user;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Billing")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "billing")
public class Billing {
    @EmbeddedId
    private BillingId billingId;
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
            },
            foreignKey = @ForeignKey(
                    name = "billing_postal_code_street_fkey"
            )
    )
    private Address address;
    @ManyToOne(
            targetEntity = Card.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumn(
            name = "card_id",
            referencedColumnName = "card_id",
            foreignKey = @ForeignKey(
                    name = "billing_card_id_fkey"
            )
    )
    private Card card;
}
