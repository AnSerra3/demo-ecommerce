package com.xdavide9.demo.product;

import com.xdavide9.demo.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "Recommendation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"users", "products"})
@Table(name = "recommendation")
public class Recommendation {
    @Id
    @SequenceGenerator(
            name = "recommendation_recommendation_id_seq",
            sequenceName = "recommendation_recommendation_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "recommendation_recommendation_id_seq",
            strategy = GenerationType.SEQUENCE
    )
    @Column(
            name = "recommendation_id",
            updatable = false
    )
    private Long recommendationId;

    @ManyToMany(
            targetEntity = User.class,
            cascade = {CascadeType.PERSIST},
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "recommendation_user",
            joinColumns = @JoinColumn(
                    name = "recommendation_id",
                    foreignKey = @ForeignKey(
                            name = "recommendation_user_recommendation_id_fkey"
                    )
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "user_id",
                    foreignKey = @ForeignKey(
                            name = "recommendation_user_user_id_fkey"
                    )
            )
    )
    private List<User> users;

    @ManyToMany(
            targetEntity = User.class,
            cascade = {CascadeType.PERSIST},
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "recommendation_product",
            joinColumns = @JoinColumn(
                    name = "recommendation_id",
                    foreignKey = @ForeignKey(
                            name = "recommendation_product_recommendation_id_fkey"
                    )
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "product_id",
                    foreignKey = @ForeignKey(
                            name = "recommendation_product_product_id_fkey"
                    )
            )
    )
    private List<Product> products;
}
