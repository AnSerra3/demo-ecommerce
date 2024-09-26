package com.xdavide9.demo.product;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("api/v1/")
public class ProductController {

    private final ProductService productService;

    @GetMapping("products")
    public String getProducts(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "product";
    }
}
