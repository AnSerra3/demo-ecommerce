package com.xdavide9.demo.jpa.entities.product;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "ProductAttachment")
@Table(name = "product_attachment")
public class ProductAttachment {

    @Id
    @SequenceGenerator(
            name = "product_attachment_product_attachment_id_seq",
            sequenceName = "product_attachment_product_attachment_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_attachment_product_attachment_id_seq"
    )
    @Column(
            name = "product_attachment_id",
            updatable = false
    )
    private Long productAttachmentId;
    @Column(
            name = "attachment_url",
            nullable = false
    )
    private String attachmentUrl;
    @ManyToOne(
            targetEntity = Product.class,
            cascade = {CascadeType.PERSIST},
            optional = false
    )
    @JoinColumn(
            name = "product_id",
            referencedColumnName = "product_id",
            foreignKey = @ForeignKey(
                    name = "product_attachment_product_id_fkey"
            )
    )
    private Product product;

}

