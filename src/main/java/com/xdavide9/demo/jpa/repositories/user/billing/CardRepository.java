package com.xdavide9.demo.jpa.repositories.user.billing;

import com.xdavide9.demo.jpa.entities.user.billing.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}
