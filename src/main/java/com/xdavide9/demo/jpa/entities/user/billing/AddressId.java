package com.xdavide9.demo.jpa.entities.user.billing;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class AddressId implements Serializable {
    @Column(
            name = "postal_code",
            updatable = false
    )
    private String postalCode;
    @Column(
            name = "street",
            updatable = false
    )
    private String street;
}
