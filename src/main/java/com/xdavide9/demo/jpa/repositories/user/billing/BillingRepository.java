package com.xdavide9.demo.jpa.repositories.user.billing;

import com.xdavide9.demo.jpa.entities.user.billing.Billing;
import com.xdavide9.demo.jpa.entities.user.billing.BillingId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepository extends JpaRepository<Billing, BillingId> {
}
