package com.xdavide9.demo.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Ticket")
@Table(name = "ticket")
public class Ticket {
    @Id
    @SequenceGenerator(
            name = "ticket_ticket_id_seq",
            sequenceName = "ticket_ticket_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ticket_ticket_id_seq"
    )
    @Column(
            name = "ticket_id",
            updatable = false
    )
    private Long ticketId;
    @Column(
            name = "message",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String message;
    @Column(
            name = "category",
            nullable = false
    )
    private String category;
    @Column(
            name = "timestamp",
            nullable = false
    )
    private LocalDateTime timestamp;
    @Column(
            name = "closed",
            nullable = false,
            columnDefinition = "boolean"
    )
    private Boolean closed = false;
    @Column(
            name = "title",
            nullable = false
    )
    private String title;
    @ManyToOne(
            targetEntity = User.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "user_id",
            foreignKey = @ForeignKey(
                    name = "ticket_user_id_fkey"
            )
    )
    private User user;
}
