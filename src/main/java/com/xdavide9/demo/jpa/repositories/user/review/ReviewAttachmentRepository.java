package com.xdavide9.demo.jpa.repositories.user.review;

import com.xdavide9.demo.jpa.entities.user.review.ReviewAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewAttachmentRepository extends JpaRepository<ReviewAttachment, Long> {
}
