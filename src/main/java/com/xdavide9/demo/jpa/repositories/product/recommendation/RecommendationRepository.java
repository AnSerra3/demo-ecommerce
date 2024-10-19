package com.xdavide9.demo.jpa.repositories.product.recommendation;

import com.xdavide9.demo.jpa.entities.product.recommendation.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
}
