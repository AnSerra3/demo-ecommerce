package com.xdavide9.demo.user;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AddressId {
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
