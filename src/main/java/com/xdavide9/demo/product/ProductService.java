package com.xdavide9.demo.product;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
