package com.xdavide9.demo.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "Discount")
@Table(name = "discount")
public class Discount {
    @Id
    @Column(
            name = "discount_code",
            updatable = false
    )
    private String discountCode;
}
