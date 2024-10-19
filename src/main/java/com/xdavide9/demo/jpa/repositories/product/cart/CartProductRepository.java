package com.xdavide9.demo.jpa.repositories.product.cart;

import com.xdavide9.demo.jpa.entities.product.cart.CartProduct;
import com.xdavide9.demo.jpa.entities.product.cart.CartProductId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartProductRepository extends JpaRepository<CartProduct, CartProductId> {
}
