package com.xdavide9.demo.jpa.repositories.product;

import com.xdavide9.demo.jpa.entities.product.ProductAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductAttachmentRepository extends JpaRepository<ProductAttachment, Long> {
}
