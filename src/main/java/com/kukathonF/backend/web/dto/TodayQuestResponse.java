package com.kukathonF.backend.web.dto;

import com.kukathonF.backend.domain.entity.Quest;
import com.kukathonF.backend.domain.entity.User;
import com.kukathonF.backend.domain.entity.constant.App;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Qualifier;

@Builder
public record TodayQuestResponse(
        String nickname,
        App app,
        Long running_time,
        String message
) {
    public static TodayQuestResponse fromQuest(
            Quest quest,
            User user
    ){
        return TodayQuestResponse.builder()
                .nickname(user.getName())
                .app(quest.getApp())
                .running_time(quest.getRunningTime())
                .message(quest.getMessage())
                .build();
    }
}
