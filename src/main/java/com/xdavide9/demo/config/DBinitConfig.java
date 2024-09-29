package com.xdavide9.demo.config;

import com.xdavide9.demo.cart.Cart;
import com.xdavide9.demo.cart.CartRepository;
import com.xdavide9.demo.customer.Customer;
import com.xdavide9.demo.customer.CustomerRepository;
import com.xdavide9.demo.customer.Role;
import com.xdavide9.demo.product.Product;
import com.xdavide9.demo.product.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Configuration
@Slf4j
public class DBinitConfig {
    @Bean
    CommandLineRunner commandLineRunner(CartRepository cartRepository, CustomerRepository customerRepository, ProductRepository productRepository, PasswordEncoder encoder) {
        return args -> {
            log.info("Inserting demo carts and products in the database");
            Customer alice = customerRepository.save(Customer.builder().name("Alice").password(encoder.encode("ciao")).role(Role.ADMIN).email("alice@gmail.com").build());
            Customer bob = customerRepository.save(Customer.builder().name("Bob").password(encoder.encode("ciao")).role(Role.USER).email("bob@gmail.com").build());
            Product laptop = productRepository.saveAndFlush(Product.builder().name("Laptop").description("High-end laptop with 16GB RAM").price(1200.00).averageRating(4.5).quantityInStock(10).quantitySold(1500).build());
            Product smartphone = productRepository.saveAndFlush(Product.builder().name("Smartphone").description("Latest smartphone with 64MP camera").price(800.00).averageRating(4.7).quantityInStock(20).quantitySold(1000).build());
            Product headphones = productRepository.saveAndFlush(Product.builder().name("Headphones").description("Wireless noise-cancelling headphones").price(150.00).averageRating(4.3).quantityInStock(30).quantitySold(25).build());
            Cart aliceCart = Cart.builder().customer(alice).products(List.of(laptop, smartphone)).build(); // Alice's cart contains Laptop and Smartphone
            Cart bobCart = Cart.builder().customer(bob).products(List.of(smartphone, headphones)).build(); // Bob's cart contains Smartphone and Headphones
            cartRepository.saveAll(List.of(aliceCart, bobCart));
        };
    }



}
