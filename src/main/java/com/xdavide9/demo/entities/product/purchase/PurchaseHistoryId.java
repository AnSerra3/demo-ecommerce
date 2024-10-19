package com.xdavide9.demo.entities.product.purchase;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Embeddable
public class PurchaseHistoryId {
    @Column(
            name = "timestamp",
            insertable = false,
            updatable = false)
    private Long userId;
    @Column(name = "postal_code",
            insertable = false,
            updatable = false)
    private String postalCode;
    @Column(name = "street",
            insertable = false,
            updatable = false)
    private String street;
    @Column(name = "card_id",
            insertable = false,
            updatable = false)
    private Long cardId;
    @Column(name = "product_id",
            insertable = false,
            updatable = false)
    private Long productId;
    @Column(name = "timestamp",
            insertable = false,
            updatable = false)
    private LocalDateTime timestamp;
}
