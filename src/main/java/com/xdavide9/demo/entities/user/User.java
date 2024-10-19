package com.xdavide9.demo.entities.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "User")
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "userr",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "userr_email_key",
                        columnNames = "email"
                ),
                @UniqueConstraint(
                        name = "userr_fiscal_code_key",
                        columnNames = "fiscal_code"
                ),
                @UniqueConstraint(
                        name = "userr_phone_number_key",
                        columnNames = "phone_number"
                )
        },
        indexes = {
                @Index(
                        name = "userr_email_key",
                        columnList = "email"
                ),
                @Index(
                        name = "userr_fiscal_code_key",
                        columnList = "fiscalCode"
                ),
                @Index(
                        name = "userr_phone_number_key",
                        columnList = "phoneNumber"
                ),
                @Index(
                        name = "index_userr_email",
                        columnList = "email"
                )
        }
)
public class User {
    @Id
    @SequenceGenerator(
            name = "userr_user_id_seq",
            sequenceName = "userr_user_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "userr_user_id_seq",
            strategy = GenerationType.SEQUENCE
    )
    @Column(
            name = "user_id",
            updatable = false
    )
    private Long userId;

    @Column(
            name = "name",
            nullable = false
    )
    private String name;

    @Column(
            name = "password",
            nullable = false
    )
    private String password;

    @Column(
            name = "date_of_birth",
            nullable = false
    )
    private LocalDate dateOfBirth;

    @Column(
            name = "email",
            unique = true,
            nullable = false)
    private String email;

    @Column(
            name = "fiscal_code",
            unique = true
    )
    private String fiscalCode;

    @Column(
            name = "phone_number",
            unique = true
    )
    private String phoneNumber;

    @Column(
            name = "country"
    )
    private String country;

    @Enumerated(EnumType.STRING)
    @Column(
            name = "role",
            nullable = false
    )
    private Role role;

    @Enumerated(EnumType.STRING)
    @Column(
            name = "gender"
    )
    private Gender gender;
}
