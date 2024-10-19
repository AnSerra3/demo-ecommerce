package com.xdavide9.demo.jpa.repositories.user.ticket;

import com.xdavide9.demo.jpa.entities.user.ticket.TicketAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketAttachmentRepository extends JpaRepository<TicketAttachment, Long> {
}
