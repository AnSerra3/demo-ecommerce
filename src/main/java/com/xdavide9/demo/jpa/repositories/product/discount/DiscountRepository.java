package com.xdavide9.demo.jpa.repositories.product.discount;

import com.xdavide9.demo.jpa.entities.product.discount.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, String> {
}
