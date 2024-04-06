package com.kukathonF.backend.web.controller;

import com.kukathonF.backend.global.common.SuccessResponse;
import com.kukathonF.backend.web.dto.QuestResponse;
import com.kukathonF.backend.web.service.QuestService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class QuestController {
    private final QuestService questService;

    @GetMapping("/users/{userId}/quests")
    public ResponseEntity<SuccessResponse<?>> getQuestInWeek(@PathVariable("userId") Long userId) {
        List<QuestResponse> findQuests = questService.findByUserIdInWeek(userId);
        return SuccessResponse.ok(findQuests);
    }

}
