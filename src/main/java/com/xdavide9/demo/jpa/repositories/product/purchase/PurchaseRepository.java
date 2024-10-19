package com.xdavide9.demo.jpa.repositories.product.purchase;

import com.xdavide9.demo.jpa.entities.product.purchase.Purchase;
import com.xdavide9.demo.jpa.entities.product.purchase.PurchaseId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, PurchaseId> {
}
