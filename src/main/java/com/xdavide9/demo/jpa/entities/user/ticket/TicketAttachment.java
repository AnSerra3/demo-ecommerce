package com.xdavide9.demo.jpa.entities.user.ticket;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "TicketAttachment")
@Table(name = "ticket_attachment")
public class TicketAttachment {
    @Id
    @SequenceGenerator(
            name = "ticket_attachment_ticket_attachment_id_seq",
            sequenceName = "ticket_attachment_ticket_attachment_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = jakarta.persistence.GenerationType.SEQUENCE,
            generator = "ticket_attachment_ticket_attachment_id_seq"
    )
    @Column(
            name = "ticket_attachment_id",
            updatable = false
    )
    private Long ticketAttachmentId;
    @Column(
            name = "attachment_url",
            nullable = false
    )
    private String attachmentUrl;
    @ManyToOne(
            targetEntity = Ticket.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumn(
            name = "ticket_id",
            referencedColumnName = "ticket_id",
            foreignKey = @ForeignKey(
                    name = "ticket_attachment_ticket_id_fkey"
            )
    )
    private Ticket ticket;


}
