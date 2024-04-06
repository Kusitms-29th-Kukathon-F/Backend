package com.kukathonF.backend.web.dto;

import com.kukathonF.backend.domain.entity.GiftBox;
import lombok.Builder;

@Builder
public record GiftBoxResponse(
        Long id,
        Boolean isOpen
) {
    public static GiftBoxResponse of(GiftBox giftBox) {
        return builder().id(giftBox.getId())
                .isOpen(giftBox.getItem().isOpen())
                .build();
    }
}
