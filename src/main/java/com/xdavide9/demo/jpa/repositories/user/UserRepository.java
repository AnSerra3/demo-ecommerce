package com.xdavide9.demo.jpa.repositories.user;

import com.xdavide9.demo.jpa.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
