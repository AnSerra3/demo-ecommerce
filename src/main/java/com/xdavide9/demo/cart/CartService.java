package com.xdavide9.demo.cart;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CartService {

    private final CartRepository cartRepository;

    public Cart getCart(Long cartId) {
        return cartRepository.findById(cartId).orElseThrow(null);
    }

    public List<Cart> getCarts() {
        return cartRepository.findAll();
    }
}
