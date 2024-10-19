package com.xdavide9.demo.jpa.repositories.product.wishlist;

import com.xdavide9.demo.jpa.entities.product.wishlist.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
}
