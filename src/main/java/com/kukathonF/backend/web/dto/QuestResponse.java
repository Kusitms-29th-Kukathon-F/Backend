package com.kukathonF.backend.web.dto;

import com.kukathonF.backend.domain.entity.Quest;
import com.kukathonF.backend.domain.entity.constant.App;
import java.util.List;
import lombok.Builder;

@Builder
public record QuestResponse(
        Long id,
        Boolean isSuccess,
        Long ago,
        String message,
        String app,
        Long runningTime
) {
    public static List<QuestResponse> ofList(List<Quest> quests) {
        return quests.stream().map(quest -> builder()
                        .id(quest.getId())
                        .ago(quest.getAgo())
                        .app(quest.getApp().getKoreanName())
                        .message(quest.getMessage())
                        .isSuccess(quest.isSuccess())
                        .runningTime(quest.getRunningTime())
                        .build())
                .toList();
    }
}
