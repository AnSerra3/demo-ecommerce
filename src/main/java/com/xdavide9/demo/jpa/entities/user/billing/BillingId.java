package com.xdavide9.demo.jpa.entities.user.billing;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class BillingId implements Serializable {

    @Column(
            name = "postal_code",
            updatable = false,
            insertable = false
    )
    private String postalCode;
    @Column(
            name = "street",
            updatable = false,
            insertable = false
    )
    private String street;
    @Column(
            name = "card_id",
            updatable = false,
            insertable = false
    )
    private Long cardId;
}
