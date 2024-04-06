package com.kukathonF.backend.domain.entity;

import static jakarta.persistence.FetchType.*;

import com.kukathonF.backend.domain.entity.constant.Period;
import com.kukathonF.backend.global.common.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GiftBox extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isOpen;

    @Enumerated(EnumType.STRING)
    private Period period;

    @ManyToOne(fetch = LAZY)
    Item item;

    @ManyToOne(fetch = LAZY)
    User user;
}
