package com.xdavide9.demo.customer;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "customer")
@Builder
public class Customer {
    @Id
    @SequenceGenerator(name = "customer_sequence", sequenceName = "customer_sequence", allocationSize = 1)
    @GeneratedValue(generator = "customer_sequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "customer_id")
    private Long customerId;
    @Column(nullable = false)
    private String name, email;
}
