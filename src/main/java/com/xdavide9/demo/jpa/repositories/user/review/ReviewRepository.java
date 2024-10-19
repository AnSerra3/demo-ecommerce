package com.xdavide9.demo.jpa.repositories.user.review;

import com.xdavide9.demo.jpa.entities.user.review.Review;
import com.xdavide9.demo.jpa.entities.user.review.ReviewId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, ReviewId> {
}
