package com.xdavide9.demo.product;

import com.xdavide9.demo.user.User;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "Wishlist")
@Table(name = "wishlist")
public class Wishlist {
    @SequenceGenerator(
            name = "wishlist_wishlist_id_seq",
            sequenceName = "wishlist_wishlist_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = jakarta.persistence.GenerationType.SEQUENCE,
            generator = "wishlist_wishlist_id_seq"
    )
    @Column(
            name = "wishlist_id",
            updatable = false
    )
    @Id
    private Long wishlistId;
    @Column(
            name = "description",
            nullable = false
    )
    private String description;
    @Column(
            name = "name",
            nullable = false
    )
    private String name;
    @OneToOne(
            targetEntity = User.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "user_id",
            foreignKey = @ForeignKey(
                    name = "wishlist_user_id_fkey"
            )
    )
    private User user;
}
