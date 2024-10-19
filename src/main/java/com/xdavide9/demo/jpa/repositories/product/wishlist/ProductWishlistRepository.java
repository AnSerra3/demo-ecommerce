package com.xdavide9.demo.jpa.repositories.product.wishlist;

import com.xdavide9.demo.jpa.entities.product.wishlist.ProductWishlist;
import com.xdavide9.demo.jpa.entities.product.wishlist.ProductWishlistId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductWishlistRepository extends JpaRepository<ProductWishlist, ProductWishlistId> {
}
