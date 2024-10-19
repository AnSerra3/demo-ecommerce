package com.xdavide9.demo.jpa.repositories.user.ticket;

import com.xdavide9.demo.jpa.entities.user.ticket.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
