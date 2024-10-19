package com.xdavide9.demo.jpa.repositories.product.purchase;

import com.xdavide9.demo.jpa.entities.product.purchase.PurchaseHistory;
import com.xdavide9.demo.jpa.entities.product.purchase.PurchaseHistoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory, PurchaseHistoryId> {
}
