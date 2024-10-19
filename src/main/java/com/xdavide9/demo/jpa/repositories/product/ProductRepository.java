package com.xdavide9.demo.jpa.repositories.product;

import com.xdavide9.demo.jpa.entities.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
