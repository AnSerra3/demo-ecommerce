package com.xdavide9.demo.user;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Card")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(
        name = "card"
)
public class Card {
    @Id
    @SequenceGenerator(
            name = "card_card_id_seq",
            sequenceName = "card_card_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "card_card_id_seq",
            strategy = GenerationType.SEQUENCE
    )
    @Column(
            name = "card_id",
            updatable = false
    )
    private Long cardId;

    @Column(
            name = "card_number",
            nullable = false
    )
    private String cardNumber;

    @Column(
            name = "name_on_card",
            nullable = false
    )
    private String nameOnCard;

    @Column(
            name = "cvv",
            nullable = false
    )
    private String cvv;

    @Column(
            name = "expiration",
            nullable = false
    )
    private String expiration;

    @ManyToOne(
            targetEntity = User.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "user_id",
            foreignKey = @ForeignKey(
                    name = "card_user_id_fkey"
            )
    )
    private User user;

}
