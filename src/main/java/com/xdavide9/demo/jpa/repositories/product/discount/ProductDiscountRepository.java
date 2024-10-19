package com.xdavide9.demo.jpa.repositories.product.discount;

import com.xdavide9.demo.jpa.entities.product.discount.ProductDiscount;
import com.xdavide9.demo.jpa.entities.product.discount.ProductDiscountId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDiscountRepository extends JpaRepository<ProductDiscount, ProductDiscountId> {
}
