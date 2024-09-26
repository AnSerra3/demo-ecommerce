package com.xdavide9.demo.home;

import com.xdavide9.demo.product.Product;
import com.xdavide9.demo.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HomeService {

    private final ProductRepository productRepository;

    public List<Product> getBestSellers() {
        return productRepository.getTop5ByQuantitySoldGreaterThanEqualOrderByQuantitySoldDesc(1000);
    }
}
