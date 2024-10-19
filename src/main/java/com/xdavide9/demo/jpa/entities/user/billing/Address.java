package com.xdavide9.demo.jpa.entities.user.billing;

import com.xdavide9.demo.jpa.entities.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Address")
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address")
public class Address {

    @EmbeddedId
    private AddressId addressId;

    @Column(
            name = "city",
            nullable = false
    )
    private String city;

    @Column(
            name = "country",
            nullable = false
    )
    private String country;

    @ManyToOne(
            targetEntity = User.class,
            optional = false,
            cascade = {CascadeType.PERSIST}
    )
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "user_id",
            foreignKey = @ForeignKey(
                    name = "address_user_id_fkey"
            )
    )
    private User user;
}
