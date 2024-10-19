package com.xdavide9.demo.user;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "ReviewAttachment")
@Table(name = "review_attachment")
public class ReviewAttachment {
    @SequenceGenerator(
            name = "review_attachment_review_attachment_id_seq",
            sequenceName = "review_attachment_review_attachment_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = jakarta.persistence.GenerationType.SEQUENCE,
            generator = "review_attachment_review_attachment_id_seq"
    )
    @Id
    private Long reviewAttachmentId;
    @Column(
            name = "attachment_url",
            nullable = false
    )
    private String attachmentUrl;
    @ManyToOne(
            targetEntity = Review.class,
            cascade = {jakarta.persistence.CascadeType.PERSIST},
            optional = false
    )
    @JoinColumns(
            value = {
                    @JoinColumn(
                            name = "timestamp",
                            referencedColumnName = "timestamp"
                    ),
                    @JoinColumn(
                            name = "user_id",
                            referencedColumnName = "user_id"
                    )
            },
            foreignKey = @ForeignKey(
                    name = "review_attachment_user_id_timestamp_fkey"
            )
    )
    private Review review;
}
