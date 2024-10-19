package com.xdavide9.demo.entities.user.review;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ReviewId {
    private Long userId;
    private LocalDateTime timestamp;
}
