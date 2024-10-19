package com.xdavide9.demo.user;

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
