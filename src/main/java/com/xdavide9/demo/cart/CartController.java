package com.xdavide9.demo.cart;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
@AllArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("/{cartId}")
    public String getCart(@PathVariable(name = "cartId") Long cartId, Model model) {
        Cart cart = cartService.getCart(cartId);
        if (cart != null) {
            model.addAttribute("cart", cart);
            model.addAttribute("products", cart.getProducts());
            return "cart";
        }
        return "error";
    }
}
