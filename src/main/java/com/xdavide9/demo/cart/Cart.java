package com.xdavide9.demo.cart;

import com.xdavide9.demo.customer.Customer;
import com.xdavide9.demo.product.Product;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cart")
public class Cart {
    @Id
    @SequenceGenerator(name = "cart_sequence", sequenceName = "cart_sequence", allocationSize = 1)
    @GeneratedValue(generator = "cart_sequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "cart_id")
    private Long cartId;

    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "cart_product",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;
}
