package com.kukathonF.backend.domain.entity;

import static jakarta.persistence.FetchType.*;

import com.kukathonF.backend.domain.entity.constant.Period;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class GiftBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isOpen;

    @Enumerated(EnumType.STRING)
    private Period period;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "item_id")
    Item item;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    User user;
}
