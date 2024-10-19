package com.xdavide9.demo.product;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Embeddable
public class PurchaseId {
    @Column(
            name = "timestamp",
            insertable = false,
            updatable = false)
    private LocalDateTime timestamp;
    @Column(name = "user_id",
            insertable = false,
            updatable = false)
    private Long userId;
    @Column(name = "card_id",
            insertable = false,
            updatable = false)
    private Long cardId;
    @Column(name = "street",
            insertable = false,
            updatable = false)
    private String street;
    @Column(name = "postal_code",
            insertable = false,
            updatable = false)
    private String postalCode;
}
