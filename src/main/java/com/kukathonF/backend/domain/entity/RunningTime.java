package com.kukathonF.backend.domain.entity;

import com.kukathonF.backend.domain.entity.constant.App;
import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RunningTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private App app;

    private Long runningTime;

    private LocalDate date;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    User user;
}
