package com.xdavide9.demo.entities.user.ticket;

import com.xdavide9.demo.entities.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Entity(name = "Message")
@Table(name = "message")
public class Message {
    @Id
    @SequenceGenerator(
            name = "message_message_id_seq",
            sequenceName = "message_message_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = jakarta.persistence.GenerationType.SEQUENCE,
            generator = "message_message_id_seq"
    )
    private Long messageId;
    @Column(
            name = "content",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String content;
    @Column(
            name = "timestamp",
            nullable = false
    )
    private LocalDateTime timestamp;
    @ManyToOne(
            targetEntity = Ticket.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumn(
            name = "ticket_id",
            referencedColumnName = "ticket_id",
            foreignKey = @ForeignKey(
                    name = "message_ticket_id_fkey"
            )
    )
    private Ticket ticket;
    @OneToOne(
            targetEntity = User.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "user_id",
            foreignKey = @ForeignKey(
                    name = "message_user_id_fkey"
            )
    )
    private User user;
}
