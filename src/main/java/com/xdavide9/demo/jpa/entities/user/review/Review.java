package com.xdavide9.demo.jpa.entities.user.review;

import com.xdavide9.demo.jpa.entities.product.Product;
import com.xdavide9.demo.jpa.entities.user.User;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "Review")
@Table(name = "review")
public class Review {
    @EmbeddedId
    private ReviewId reviewId;
    @ManyToOne(
            targetEntity = Product.class,
            optional = false,
            cascade = {jakarta.persistence.CascadeType.PERSIST}
    )
    @JoinColumn(
            name = "product_id",
            referencedColumnName = "product_id",
            foreignKey = @jakarta.persistence.ForeignKey(
                    name = "review_product_id_fkey"
            )
    )
    private Product product;
    @ManyToOne(
            targetEntity = User.class,
            optional = false,
            cascade = {jakarta.persistence.CascadeType.PERSIST}
    )
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "user_id",
            foreignKey = @jakarta.persistence.ForeignKey(
                    name = "review_user_id_fkey"
            )
    )
    @MapsId("userId")
    private User user;
    @Column(
            name = "rating",
            nullable = false
    )
    private Integer rating;
    @Column(
            name = "message",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String message;
    @Column(
            name = "title",
            nullable = false
    )
    private String title;
}
