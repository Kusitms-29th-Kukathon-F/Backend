package com.kukathonF.backend.web.dto;

import com.kukathonF.backend.domain.entity.Item;
import java.util.List;
import lombok.Builder;

@Builder
public record ItemResponse(
        Long id,
        String name,
        String grade,
        Boolean isOpen
) {

    public static ItemResponse of(Item item) {
        return builder()
                .id(item.getId())
                .name(item.getName())
                .grade(item.getGrade().getKoreanName())
                .isOpen(item.isOpen())
                .build();
    }

    public static List<ItemResponse> ofList(List<Item> items) {
        return items.stream().map(item -> builder()
                                .id(item.getId())
                                .name(item.getName())
                                .grade(item.getGrade().getKoreanName())
                                .isOpen(item.isOpen())
                                .build())
                .toList();
    }
}
