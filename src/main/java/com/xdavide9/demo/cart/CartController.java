package com.xdavide9.demo.cart;

import com.xdavide9.demo.customer.Customer;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("/cart")
    public String getCart(Model model) {
        Customer principal = (Customer) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Cart cart = cartService.getCart(principal.getCustomerId());
        model.addAttribute("cart", cart);
        model.addAttribute("products", cart.getProducts());
        return "cart";
    }

    @GetMapping("/api/v1/carts")
    public String getCarts(Model model) {
        model.addAttribute("carts", cartService.getCarts());
        return "api-carts";
    }
}
